package com.brcd.controller;



import com.brcd.bean.*;
import com.brcd.common.util.ExportExcel;
import com.brcd.service.*;
import com.github.pagehelper.PageHelper;
import com.sun.deploy.net.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/**
 * 商户管理控制层
 * Created by admin on 2017/9/5.
 */
@Controller
@RequestMapping("businessUser")
public class TbBusinessUserController {
    @Autowired
    private TbBusinessUserService tbBusinessUserService;
    @Autowired
    private TbBankcardInfoService tbBankcardInfoService;
    @Autowired
    private TbBusinessService tbBusinessService;
    @Autowired
    private BankService bankService;
    @Autowired
    private TbAreaDictionaryService tbAreaDictionaryService;
    @Autowired
    private TbWechatTradeService tbWechatTradeService;
    @Autowired
    private TbAlipayTradeService tbAlipayTradeService;
    /*
    * 时间格式的转换
    */
    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }


    /**
     * 跳转到添加商户页面
     */
    @RequestMapping("/goToInsertBusinessUser")
    public String goToIsert(Model model,HttpSession session){
        List<TbAreaDictionary> addrList = tbAreaDictionaryService.findByareaId();
        model.addAttribute("provinceList",addrList);
        List<String> bankNameList = bankService.findBankName();
        model.addAttribute("bankNameList",bankNameList);
        TbAgent agentLogin = (TbAgent) session.getAttribute("agentLogin");
        model.addAttribute("agentLogin",agentLogin);
        return "menu/commercial/addCommercial";
    }

    /**
     * 将接收的商户信息插入到数据库
     */
    @RequestMapping("/insertBusinessUser")
    public String insertBusinessUser(TbBusinessUser tbBusinessUser, TbBusiness business, TbBankcardInfo bankcardInfo) {
        tbBusinessUserService.insertBusinessUser(tbBusinessUser, business, bankcardInfo);
        return "home/home";
    }

    /**
     * 多条件查询商户,以及分页,跳转
     * @param request
     * @param session
     * @param tbBusinessUser
     * @param currentPage
     * @return
     */
    @RequestMapping("/query")
    public ModelAndView query(HttpServletRequest request,HttpSession session, TbBusinessUser tbBusinessUser, Integer currentPage) {

        //共有多少条数据
        Integer listCount = tbBusinessUserService.query(tbBusinessUser).size();

        if(currentPage == null){
            currentPage = 1;//如果没有接收到页码的参数,就设置默认为0
        }
        Integer pageSize =10;//设置每页的条数

        int pageCount =  listCount / pageSize + (listCount % pageSize != 0 ? 1 : 0);//开始分页,计算总页码

        PageHelper.startPage(currentPage, pageSize);//分页插件开始分页
        List<TbBusinessUser> query = tbBusinessUserService.query(tbBusinessUser);//查询10条数据,想用于页面显示
        ModelAndView mv = new ModelAndView("menu/commercial/shanghuchaxun.html");
        mv.addObject("shangHu",query);
        mv.addObject("history",tbBusinessUser);
        request.setAttribute("currentPage",currentPage);
        request.setAttribute("pageCount",pageCount);
        request.setAttribute("listCount",listCount);
        return mv;
    }

    /*
        导出到excel文档
     */
    @RequestMapping("/exportExcel")
    public void exportExcel(TbBusinessUser tbBusinessUser, HttpServletRequest request, HttpServletResponse response)throws Exception{

        String[] headers = {"商户编号","所属代理商","商户类型","经营名称","商户名称","法人姓名","法人身份证","联系人","联系电话","联系邮箱","客服电话","经营地址","经营省","经营市"
                ,"经营区","营业执照编号","注册地址","身份证正面","身份证反面","身份证手持","银行卡正面","营业执照照片","门头照","开户许可证照片","商户状态","起始时间","结束时间","商户秘钥"};

        String fileName="商户查询.xls";
        String userAgent = request.getHeader("User-Agent");
        //针对IE或者以IE为内核的浏览器：
        if (userAgent.contains("MSIE")||userAgent.contains("Trident")) {
            fileName = URLEncoder.encode(fileName, "GBK");
        } else {//非IE浏览器的处理：
            fileName = new String(fileName.getBytes("GBK"),"ISO-8859-1");
        }

        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", fileName));
        response.setContentType("application/vnd.ms-excel;charset=GBK");
        response.setCharacterEncoding("GBK");

        ExportExcel<TbBusinessUser> ex = new ExportExcel<>();

        List<TbBusinessUser> list = tbBusinessUserService.query(tbBusinessUser);

        OutputStream out = response.getOutputStream();
        ex.exportExcel(headers, list, out);
        out.close();
    }
    /*
        查询某一条数据的详细的信息
     */
    @RequestMapping("/detail")
    public ModelAndView detail(String id){
        TbBusinessUser byBusinessUid = tbBusinessUserService.findByBusinessUid(id);
        if(byBusinessUid.getTbBankcardInfo()==null){
            byBusinessUid.setTbBankcardInfo(new TbBankcardInfo());
        }
        if(byBusinessUid.getTbBusiness() == null){
            byBusinessUid.setTbBusiness(new TbBusiness());
        }
        ModelAndView mv = new ModelAndView("menu/commercial/shanghuxiangqing.html");
        mv.addObject("shang",byBusinessUid);
        return mv;
    }



    @RequestMapping("toManage")
    public String shanghu(){ return "menu/commercial/shanghuxinxifguanli.html";}

    /**
     * 进入商户修改页面
     * @param model
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdate(Model model ,String businessUid){

        List<TbAreaDictionary> addrList = tbAreaDictionaryService.findByareaId();
        model.addAttribute("provinceList",addrList);
        TbBusinessUser business = tbBusinessUserService.findByBusinessUid(businessUid);
        model.addAttribute("businessUser",business);
        List<TbAreaDictionary> cityList = tbAreaDictionaryService.findByAreaOde(business.getManageProvince());
        model.addAttribute("cityList",cityList);
        List<TbAreaDictionary> districtList = tbAreaDictionaryService.findByAreaOde(business.getManageCity());
        model.addAttribute("districtList",districtList);
        List<TbAreaDictionary> bankCityList = tbAreaDictionaryService.findByUpAreaName(business.getTbBankcardInfo().getBankProvince());
        model.addAttribute("bankCityList",bankCityList);
        Bank bank=new Bank();
        bank.setProvince(business.getTbBankcardInfo().getBankProvince());
        bank.setCity(business.getTbBankcardInfo().getBankCity());
        bank.setBankName(business.getTbBankcardInfo().getBankName());
        List<Bank> bankList = bankService.findByBankName(bank);
        model.addAttribute("bankList",bankList);
        List<TbAlipayTrade> alipayList = tbAlipayTradeService.getAlipayTrade();
        model.addAttribute("alipayList",alipayList);
        List<TbWechatTrade> wechatTradeList = tbWechatTradeService.getWechatTrade();
        model.addAttribute("wechatTradeList",wechatTradeList);

        for (Bank bankl : bankList){
            System.out.println(bankl);
        }
        List<String> bankNameList = bankService.findBankName();
        model.addAttribute("bankNameList",bankNameList);
        return "menu/commercial/businessUserUpdate.html";}
    /**
     *商户修改的方法
     *@param tbBusinessUser
     *@return
     */
    @RequestMapping("updateTbBusinessUser")
    public ModelAndView updateTbBusinessUser(TbBusinessUser tbBusinessUser,HttpServletRequest request,HttpSession session) {
        tbBusinessUserService.updateTbBusinessUser(tbBusinessUser);
        TbBusinessUser tb=new TbBusinessUser();
        TbAgent agentLogin = (TbAgent) session.getAttribute("agentLogin");
        tb.setAffiliationAgent(agentLogin.getAgentNumber());
        return query(request,session,tb,null);


    }
  
    /**
     * 根据大行名称、省、市查询该条件下的支行
     * @param bank
     * @return
     */
    @RequestMapping("findByBankName")
    @ResponseBody
    public List<Bank> findByBankName(Bank bank){
        return bankService.findByBankName(bank);
    }
    @RequestMapping("findBankNo")
    @ResponseBody
    public String findBankNo(String bankSubName){
        return bankService.findBankNo(bankSubName);
    }

    /**
     * 跳转到商户登录页面
     */
    @RequestMapping("/goToBusinessLogin")
    public String goToBusinessLogin(){
        return "merchat/login";
    }

    /**
     * 商户登录
     */
    @RequestMapping("/loginBusiness")
    public String loginBusiness(TbBusinessUser tbBusinessUser,HttpSession session, Model model){
        System.err.println("------loginBusiness------"+tbBusinessUser);
        if(tbBusinessUser != null){
            TbBusinessUser BusinessUser = tbBusinessUserService.loginBusinessUser(tbBusinessUser);
//           boolean exists = redisTemplate.hasKey("BusinessUser");
            System.err.println("登录的用户----"+BusinessUser);
            if (BusinessUser != null) {
//               if (exists == true) {
//                   TbBusinessUser BusinessUser1 = (TbBusinessUser) session.getAttribute("BusinessUser");
//                    session.setAttribute("BusinessUser", BusinessUser1);
//                } else {
                session.setAttribute("BusinessUser", BusinessUser);
//                }

                return "merchat/shoukuan";
            }
        }
        model.addAttribute("errorMsg", "用户名或密码错误");
        return "/merchat/login";
    }

    /**
     * 验证手机号是否存在
     */
    @RequestMapping("/findBusinessUserBycontactPhone")
    @ResponseBody
    public String  findBusinessUserBycontactPhone(String contactPhone){
        System.out.println("**************************************");
        TbBusinessUser bycontactPhone = tbBusinessUserService.findBusinessUserBycontactPhone(contactPhone);
        if(bycontactPhone != null){
            System.out.println("1111111111111111111");
            return "true";
        }
        return "false";
    }

}
