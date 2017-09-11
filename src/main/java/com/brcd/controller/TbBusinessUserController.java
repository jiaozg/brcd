package com.brcd.controller;


import com.brcd.bean.Bank;
import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import com.brcd.common.util.Upload;
import com.brcd.service.BankService;
import com.brcd.common.util.ExportExcel;
import com.brcd.service.TbBankcardInfoService;
import com.brcd.service.TbBusinessService;
import com.brcd.service.TbBusinessUserService;
import com.github.pagehelper.PageHelper;
import com.sun.deploy.net.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    public String goToIsert(Model model){
        List<String> bankNameList = bankService.findBankName();
        model.addAttribute("bankNameList",bankNameList);
        return "menu/commercial/addCommercial";
    }

    /**
     * 将接收的商户信息插入到数据库
     */
    @RequestMapping("/insertBusinessUser")
    public String insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo) {
        tbBusinessUserService.insertBusinessUser(businessUser, business, bankcardInfo);


        return "redirect:/businessUser/query";
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
       if(tbBusinessUser == null){
           tbBusinessUser = new TbBusinessUser();
       }
        tbBusinessUser.setAffiliationAgent("代理商");

        Integer listCount = tbBusinessUserService.query(tbBusinessUser).size();

        if(currentPage == null){
            currentPage = 1;
        }
        Integer pageSize =10;

        int pageCount =  listCount / pageSize + (listCount % pageSize != 0 ? 1 : 0);

        PageHelper.startPage(currentPage, pageSize);
        List<TbBusinessUser> query = tbBusinessUserService.query(tbBusinessUser);
        ModelAndView mv = new ModelAndView("menu/commercial/shanghuchaxun.html");
        mv.addObject("shangHu",query);
        mv.addObject("history",tbBusinessUser);
        request.setAttribute("currentPage",currentPage);
        request.setAttribute("pageCount",pageCount);
        request.setAttribute("listCount",listCount);
        return mv;
    }


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

    @RequestMapping("toManage")
    public String shanghu(){
        return "menu/commercial/shanghuxinxifguanli.html";
    }


    @RequestMapping("toUpdate")
    public String toUpdate(Model model){
        List<String> bankNameList = bankService.findBankName();
        model.addAttribute("bankNameList",bankNameList);
        return "menu/commercial/businessUserUpdate.html";}
    /**
     *商户修改的方法
     *@param tbBusinessUser
     *@return
     */
    @RequestMapping("updateTbBusinessUser")
    public String updateTbBusinessUser(TbBusinessUser tbBusinessUser) {
        tbBusinessUserService.updateTbBusinessUser(tbBusinessUser);
      /*  tbBusinessService.updateTbBusiness(tbBusinessUser.getTbBusiness());
        tbBankcardInfoService.updateTbBankcardInfo(tbBusinessUser.getTbBankcardInfo());*/
        return "menu/commercial/shanghuxinxifguanli.html";


    }

    /**
     * 根据大行名称、省、市查询该条件下的支行
     * @param bank
     * @return
     */
    @RequestMapping("findByBankName")
    @ResponseBody
    public List<Bank> findByBankName(Bank bank){
        System.out.println(bank.getProvince());
        return bankService.findByBankName(bank);
    }
    @RequestMapping("findBankNo")
    @ResponseBody
    public String findBankNo(String bankSubName){
        return bankService.findBankNo(bankSubName);
    }

}
