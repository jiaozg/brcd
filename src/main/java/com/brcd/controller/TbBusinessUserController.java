package com.brcd.controller;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo){
        businessManagementService.insertBusinessUser(businessUser,business,bankcardInfo);
        return "";
    }
}
