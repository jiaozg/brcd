package com.brcd.controller;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusinessUser;
import com.brcd.service.TbBankcardInfoService;
import com.brcd.service.TbBusinessService;
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
    private TbBusinessUserService tbBusinessUserService;
    @Autowired
    private TbBankcardInfoService tbBankcardInfoService;
    @Autowired
    private TbBusinessService tbBusinessService;
    /**
     * 商户修改的方法
     * @param tbBusinessUser
     * @return
     */
    @RequestMapping("updateTbBusinessUser")
    public String updateTbBusinessUser(TbBusinessUser tbBusinessUser) {
        tbBusinessUserService.updateTbBusinessUser(tbBusinessUser);
        tbBusinessService.updateTbBusiness(tbBusinessUser.getTbBusiness());
        tbBankcardInfoService.updateTbBankcardInfo(tbBusinessUser.getTbBankcardInfo());
        return null;

    }
}
