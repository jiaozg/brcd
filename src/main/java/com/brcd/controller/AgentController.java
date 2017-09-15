
package com.brcd.controller;

import com.brcd.bean.*;

import com.brcd.common.util.*;
import com.brcd.service.AgentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sun.deploy.net.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
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
     * 跳转的按结构查询
     * @return
     */
    @RequestMapping("/toAgetnSeach")
    public String toAgetnSeach(){

        return "menu/agent/agentSeach";
    }
    /**
     * 显示结构树页面
     * @return
     */
    @RequestMapping("/toAgetnTree")
    public String toAgetnTree(){

        return "menu/agent/select";
    }

    /**
     * 显示所有代理商列表
     * 按条件查询
     * 分页
     * @param agent
     * @param model
     * @return List<TbAgent>
     */
    @RequestMapping(value="/getAgent")
    public String getAgent(TbAgent agent, Model model, Integer pageNo,HttpSession session){

        //分页查询
        if(pageNo==null){
            pageNo=1;
        }
        int  pageSize=10;
        Page<TbAgent> agents = agentService.getAgent(agent,pageNo,pageSize,session);
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
        //添加代理级别参数
        List<TbDictionary> agentGrades = agentService.lookUpWork("agentGrade");
        model.addAttribute("grade",agentGrades);
        //添加审核状态参数
        List<TbDictionary> agentStatus = agentService.lookUpWork("auditStatus");
        model.addAttribute("status",agentStatus);
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

    /**
     * 添加代理商
     * @param agent
     * @return
     */
    @RequestMapping("/addAgent")
    public String addAgent(TbAgent agent, String token, HttpSession session, Model model){
      //获取token信息
       String addToken = (String) session.getAttribute("token");
      //判断是否重复提交
        if(addToken!=null&&token.equals(addToken)){
            //获取代理商登陆后的信息
            TbAgent loginAgent=(TbAgent) session.getAttribute("agentLogin");
            //必须在代理商登陆的情况下进行的操作
              if(loginAgent!=null){
                  agent.setAgentGrade(loginAgent.getAgentGrade()+1);//设置代理商级别
                  agent.setSuperiorAgencyId(loginAgent.getSuperiorAgencyId()); //设置上级代理商id
                  agent.setOriginalAgencyId(IDUtils.getLongAgencyId());//设置本代理id
                  agent.setAgentNumber(AccountUtil.getRandomString(3)+IDUtils.genItemId());  //设置代理商编号
                  agent.setSecretKey(IDUtils.genItemId()+AccountUtil.getRandomString(6));//设置密钥
                  agent.setAccount(AccountUtil.getRandomString(15));//设置账号
                  agent.setPassword(MD5Util.MD5Encode(agent.getPassword()));//密码加密
              }
              else{
                  //跳到错误页面
                  model.addAttribute("msg","系统检测您没有登陆或账号审核未通过");
                  return "/error/error";
              }
              //校验费率添加是否合理
            if(agent.getRate()==null||agent.getRate()<loginAgent.getRate()) {
                //返回添加页面
                return "/menu/agent/addAgent";
              }
              if(loginAgent.getAgentGrade()>4 || loginAgent.getAgentGrade()<0){
                  session.removeAttribute("token");
                  return "/menu/agent/addAgent";
              }
            agentService.addAgent(agent);
            session.removeAttribute("token");
            return "redirect:http://localhost:8080/brcd/agent/getAgent";
        }
            model.addAttribute("msg","您已经提交过了信息了请勿重复提交");
        //跳到错误页面
            return "/error/error";
    }
    /**
     * 生成防重复提交令牌
     * @return
     */
    @RequestMapping("/initToken")
    public String initToken(HttpSession session){
       session.setAttribute("token", Uid.getUuid());
        return "menu/agent/addAgent";
    }

    /**
     * 查询一个代理商返回显信息
     * @param id
     * @return
     */
    private TbAgent findOneAgent(Long id){

         return agentService.findAgentById(id);
    }
    /**
     * 回显修改代理商信息
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/showBack")
    public String showBack(Long id,Model model,HttpSession session){
        model.addAttribute("accounts",agentService.lookUpWork("accountType"));//账户类型
        model.addAttribute("audits",agentService.lookUpWork("auditStatus"));  //审核状态
        model.addAttribute("intoQxes",agentService.lookUpWork("intoPermissions")); //进件权限
        model.addAttribute("rates",agentService.lookUpWork("shareBenefit"));    //分润权限
        model.addAttribute("tAndOs",agentService.lookUpWork("tAndOStatus"));   //t+o
        model.addAttribute("roles", agentService.lookUpWork("role"));         //角色
        model.addAttribute("userTypes",agentService.lookUpWork("userType")); //用户类型
        model.addAttribute("yeOrNoKts", agentService.lookUpWork("whetherDredge")); //是否开通0
        TbAgent agent = findOneAgent(id);
        model.addAttribute("showAgent",agent);
        session.setAttribute("updateToken",Uid.getUuid());
        return "menu/agent/updateAgent";
    }

    /**
     * 修改代理商信息
     * @param agent
     * @param session
     * @param token
     * @return
     */
    @RequestMapping("/updateAgent")
    public String updateAgent(TbAgent agent,HttpSession session,String token,Model model){
             String updateToken=(String) session.getAttribute("updateToken");
             if(updateToken!=null&&updateToken.equals(token)){
                 agentService.updateAgent(agent);
                 session.removeAttribute("updateToken");
                 return "redirect:http://localhost:8080/brcd/agent/getAgent";
             }
              //跳到错误页面
               model.addAttribute("msg","您已经提交过了信息了请勿重复提交");
               return "/error/error";
    }

    /**
     * 分级查询
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("/classificationQuery")
    @ResponseBody
    public List<AgentTree> classificationQuery(Long id,HttpSession session){
        if(id==null){
            TbAgent agent = (TbAgent) session.getAttribute("agentLogin");
            if(agent!=null && agent.getId()!=null){
                id=agent.getId();
            }
            else {

                return null;
            }
        }

         return agentService.classificationQuery(id);
    }

    /**
     * 显示分级查询的树
     * @return
     */
    @RequestMapping("/toSelectAgent")
    public String toSelectAgent(){
        return "menu/agent/select";
    }

    /**
     * 查询所有的省份
     * @return
     */
    @RequestMapping("/getRegisterCardProvinces")
    @ResponseBody
    public List<String> getRegisterCardProvinces(){
        return agentService.getRegisterCardProvinces();
    }

    /**
     * 根据省份查询所有的市
     * @param bank
     * @return
     */
    @RequestMapping("/getRegisterCardCity")
    @ResponseBody
    public List<String> getRegisterCardCity(Bank bank){
        return agentService.getRegisterCardCity(bank);
    }

    /**
     * 根据省份、市查询支行
     * @param bank
     * @return
     */
    @RequestMapping("/getSubBranchBank")
    @ResponseBody
    public List<String> getSubBranchBank(Bank bank){
        return agentService.getSubBranchBank(bank);
    }

    /**
     * 根据省份、市查询银联号
     * @param bank
     * @return
     */
    @RequestMapping("/getUnionpayNo")
    @ResponseBody
   public List<String> getUnionpayNo(Bank bank){
        return agentService.getUnionpayNo(bank);
    }

    /**
     * 导出数据
     * @param agent
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/exportData")
    public void exportExcel( TbAgent agent,HttpServletRequest request, HttpSession session,HttpServletResponse response)throws Exception{

        String[] headers = {"代理商编号","代理商简称","电话","代理商级别","审核状态","代理区域","进件权限","分润权限","费率"};

        String fileName="代理商信息记录.xls";
        String userAgent = request.getHeader("User-Agent");
        //针对IE或者以IE为内核的浏览器：
        if (userAgent.contains("MSIE")||userAgent.contains("Trident")) {
            fileName = URLEncoder.encode(fileName, "GBK");
        } else {//非IE浏览器的处理：
            fileName = new String(fileName.getBytes("GBK"),"ISO-8859-1");
        }

        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", fileName));
        response.setContentType("application/vnd.ms-excel;charset=GBK");
        response.setCharacterEncoding("GBK");

        ExportExcel<ExportAgent> ex = new ExportExcel<>();
        TbAgent agentLogin=(TbAgent) session.getAttribute("agentLogin");
        agent.setId(agentLogin.getId());
        List<ExportAgent> pageList = agentService.getAgentForExl(agent);
        OutputStream out = response.getOutputStream();

        ex.exportExcel(headers,pageList,out);

        out.close();
    }
}
