
package com.brcd.controller;

import com.brcd.bean.TbAgent;
import com.brcd.service.AgentService;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 代理商管理控制层(controller)
 * Created by 韩明泽 on 2017/9/5.
 */

@Controller
@RequestMapping("/agent")
public class AgentController {
    @Autowired
    private AgentService agentService;


/**
     * 测试
     * @return
     */

    @RequestMapping("/find")
    public List<TbAgent> findAll(){

        return agentService.findAll();
    }


/**
     * 显示所有代理商列表
     * 按条件查询
     * 分页
     * @param agent
     * @param model
     * @return List<TbAgent>
     */

    @RequestMapping(value="/getAgent",method = RequestMethod.GET)
    public String getAgent(TbAgent agent, Model model, Integer pageNo){
        //分页查询
        if(pageNo==null){
            pageNo=1;
        }
          int  pageSize=2;
        Page<TbAgent> agents = agentService.getAgent(agent,pageNo,pageSize);
        model.addAttribute("agentList",agents);
        model.addAttribute("showBack",agent);
        //分页信息
        PageInfo<TbAgent> pageInfo=new PageInfo<>(agents);
        //添加分页的参数
        long total = pageInfo.getTotal(); //总记录数
        int pages = pageInfo.getPages();   //总条数
        model.addAttribute("total",total);
        model.addAttribute("pages",pages);
        model.addAttribute("pageNo",pageNo);
        return "menu/agent/dailishangxinxiguanli";
    }


/**
     * 根据id查询代理商详细信息
     * @param id
     * @param model
     * @return
     */

    @RequestMapping("/findAgentById")
    public String findAgentById(Long id,Model model){
        TbAgent agent = agentService.findAgentById(id);
         model.addAttribute("agent",agent);
         return "menu/agent/agentInfo";
    }
}

