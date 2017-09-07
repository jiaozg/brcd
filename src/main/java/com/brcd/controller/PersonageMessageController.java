package com.brcd.controller;

import com.brcd.bean.TbAgent;
import com.brcd.service.PersonageMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by 任彩雨 on 2017/9/5.
 * 个人信息的Controller
 */
@Controller
public class PersonageMessageController {
    @Autowired
    private PersonageMessageService personageMessageService;

    @RequestMapping("toPersonageMessage")
    public String PersonageMessage(Model model, HttpSession session) {
        TbAgent agent = (TbAgent) session.getAttribute("agentLogin");
        TbAgent queryAgentMsg = personageMessageService.queryAgentMsg(agent);
        System.out.println(queryAgentMsg);
        model.addAttribute("agentMsg", queryAgentMsg);
        return "user/gerenxinxi";
    }

    @RequestMapping("save")
    public String save(TbAgent tbAgent) {
        System.out.println("修改的对象：" + tbAgent);
        personageMessageService.updatePersonageMsg(tbAgent);
        return "login";
    }

}
