
package com.brcd.controller;

import com.brcd.bean.FtpMsg;
import com.brcd.bean.TbAgent;
import com.brcd.common.util.DateUtil;
import com.brcd.common.util.MD5Util;
import com.brcd.service.AgentLoginService;
import com.brcd.service.FtpMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * Created by 任彩雨 on 2017/9/5.
 * 代理商登录模块
 */

@Controller
public class AgentLoginController {
    @Autowired
    private AgentLoginService agentLoginService;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    //到登录界面
    @RequestMapping("toAgentLogin")
    public String toAgentLogin() {
        return "login";
    }

    //退出登录
    @RequestMapping("AgentExit")
    public String AgentExit(HttpSession session) {
        session.removeAttribute("agentLogin");//退出的时候注销Session
        return "login";
    }

    //登录
    @RequestMapping("AgentLogin")
    public String agentLogin(TbAgent tbAgent, HttpSession session, Model model) {
        if (tbAgent != null) {
            TbAgent agentLogin = agentLoginService.AgentLogin(tbAgent);
           boolean exists = redisTemplate.hasKey("agentLogin");//判断Redis中是否有数据
            if (agentLogin != null) {
                if (agentLogin.getAuditStatus() != 1) {//审核状态=1才是审核通过状态
                    model.addAttribute("errorMsg", "审核状态未通过");
                    return "login";
                }
                if (exists == true) {//Redis中是否有Session的值
                    TbAgent agentLogin1 = (TbAgent) session.getAttribute("agentLogin");//取出来Redis中的Session值
                    session.setAttribute("agentLogin", agentLogin1);
                } else {
                    session.setAttribute("agentLogin", agentLogin);
                }
                return "home/home";
           }
        }

        model.addAttribute("errorMsg", "用户名或密码错误");
        return "login";
    }

    @RequestMapping("/{url}")//当请求找不到对应额Url的时候就会执行这个方法
    public String url(@PathVariable("url") String url) {
        return "home/" + url;
    }

}

