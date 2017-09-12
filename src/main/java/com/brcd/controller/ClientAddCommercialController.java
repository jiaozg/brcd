package com.brcd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WangHongChuan on 2017-09-12.
 * 用于终端(手机、平板)登录添加商户平台的controller
 */
@Controller
public class ClientAddCommercialController {

    @RequestMapping("gotoCommercial")
    public String gotoCommercial(){
        return "menu/commercial/noLoginAddCommercial";
    }


}
