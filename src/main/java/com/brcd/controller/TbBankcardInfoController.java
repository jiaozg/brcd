package com.brcd.controller;

import com.brcd.service.TbBankcardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2017/9/6.
 */
@Controller
public class TbBankcardInfoController {
    @Autowired
    private TbBankcardInfoService tbBankcardInfoService;
    @RequestMapping("{url}")
    public String login(@PathVariable("url")String url){
        System.out.println(url);
        return url;}
        @RequestMapping("update")
         public String update(){
        return "menu/agent/adddailishang";
        }
    @RequestMapping("home")
    public String home(){
        return "home/home";
    }
}
