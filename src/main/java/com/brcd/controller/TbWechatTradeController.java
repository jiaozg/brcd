package com.brcd.controller;

import com.brcd.bean.TbWechatTrade;
import com.brcd.service.TbWechatTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lenovo on 2017/9/7.
 */
@Controller
@RequestMapping("/wechatTrade")
public class TbWechatTradeController {
    @Autowired
    private TbWechatTradeService tbWechatTradeService;

    @RequestMapping("/findWechatTrade")
    @ResponseBody
    public List<TbWechatTrade> getWechatTrade(){
        List<TbWechatTrade> wechatTrades = tbWechatTradeService.getWechatTrade();
        for(TbWechatTrade t : wechatTrades){
            System.out.println(t);
        }
        return wechatTrades;
    }
}
