package com.brcd.controller;

import com.brcd.bean.TbSettle;
import com.brcd.service.TbSettleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 朱梦光 on 2017/9/7.查询结算交易Controller
 */
@Controller
public class TbSettleController {

    @Autowired
    private TbSettleService tbSettleService;
    @RequestMapping("/pageIndex")
    public String pageIndex(){

        return "forward:selectTbSettleList";
    }


    @RequestMapping("/selectTbSettleList")
    public String selectTbSettleList(TbSettle settle, Model  model){

        List<TbSettle> list = tbSettleService.selectTbSettleList(settle);
        model.addAttribute("selectTbSettleList",list);
     return "menu/jiesuanguanli/jiesuanjilu";
    }
}
