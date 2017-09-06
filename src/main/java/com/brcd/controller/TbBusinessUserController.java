package com.brcd.controller;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商户管理控制层
 * Created by admin on 2017/9/5.
 */
@Controller
public class TbBusinessUserController {
    @Autowired
    private TbBusinessUserService businessManagementService;

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
    public String insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo){
        businessUser.setBusinessUid("11233");
        businessManagementService.insertBusinessUser(businessUser,business,bankcardInfo);
        System.out.printf("zhangsan1111111111111111111111111111111111111111111111111111111111");

        String s = businessUser.toString();
        String s1 = business.toString();
        String s2 = bankcardInfo.toString();
        System.out.printf(s);
        System.out.printf(s1);
        System.out.printf(s2);
        String sss = s +"      "+s1+"         "+s2;
        return sss;
    }
}
