package com.brcd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WangHongChuan on 2017-09-11.
 */
@Controller
public class TestController {

    @RequestMapping("gotoPays")
    public String gotoPay(){
        return "merchant/login";
    }
}
