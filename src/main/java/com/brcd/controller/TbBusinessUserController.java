package com.brcd.controller;


import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;

import com.brcd.service.TbBankcardInfoService;
import com.brcd.service.TbBusinessService;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
    public String goToIsert(){
        return "menu/commercial/addCommercial";
    }

    /**
     * 将接收的商户信息插入到数据库
     */
    @RequestMapping("/insertBusinessUser")
    @ResponseBody
    public String insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo) {
        businessUser.setBusinessUid("11233");
        tbBusinessUserService.insertBusinessUser(businessUser, business, bankcardInfo);
        System.out.printf("zhangsan1111111111111111111111111111111111111111111111111111111111");

        String s = businessUser.toString();
        String s1 = business.toString();
        String s2 = bankcardInfo.toString();
        System.out.printf(s);
        System.out.printf(s1);
        System.out.printf(s2);
        String sss = s + "      " + s1 + "         " + s2;
        return sss;
    }

    @RequestMapping("/shangHuChaXun")
    public ModelAndView shangHuChaXun() {
        System.out.println(111111111);
        return new ModelAndView("menu/commercial/shanghuchaxun.html");
    }
    @RequestMapping("/query")
    public ModelAndView query(TbBusinessUser tbBusinessUser) {
        List<TbBusinessUser> query = tbBusinessUserService.query(tbBusinessUser);
        ModelAndView mv = new ModelAndView("menu/commercial/shanghuchaxun.html");
        mv.addObject("shangHu",query);
        return mv;
    }
    @RequestMapping("toQuery")
    public String shanghu(){
        System.out.println("进入方法================");
        return "menu/commercial/shanghuxinxifguanli.html";}
        @RequestMapping("toUpdate")
        public String toUpdate(){
            return "menu/commercial/businessUserUpdate.html";
        }
    /**
     *商户修改的方法
     *@param tbBusinessUser
     *@return
     */
    @RequestMapping("updateTbBusinessUser")
    public String updateTbBusinessUser(TbBusinessUser tbBusinessUser) {
        tbBusinessUserService.updateTbBusinessUser(tbBusinessUser);
        tbBusinessService.updateTbBusiness(tbBusinessUser.getTbBusiness());
        tbBankcardInfoService.updateTbBankcardInfo(tbBusinessUser.getTbBankcardInfo());
        return null;


    }

}
