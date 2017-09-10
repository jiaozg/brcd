package com.brcd.controller;

import com.brcd.bean.*;
import com.brcd.common.pojo.AgentGrade;

import com.brcd.common.util.IDUtils;
import com.brcd.common.util.Uid;
import com.brcd.service.AgentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
        //添加代理级别参数
        List<Dd> agentGrades = agentService.lookUpWork("agentGrade");
        model.addAttribute("grade",agentGrades);
        //添加审核状态参数
        List<Dd> agentStatus = agentService.lookUpWork("auditStatus");
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
    public String findAgentById(Long id,Model model,HttpSession session){
        TbAgent agent = agentService.findAgentById(id);
         model.addAttribute("agent",agent);
        session.setAttribute("loginAgent",agent);
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
            TbAgent loginAgent=(TbAgent) session.getAttribute("loginAgent");
            //必须在代理商登陆的情况下进行的操作
              if(loginAgent!=null){
                  agent.setAgentGrade(loginAgent.getAgentGrade()+1);//设置代理商级别
                  agent.setSuperiorAgencyId(loginAgent.getSuperiorAgencyId()); //设置上级代理商id
                  agent.setOriginalAgencyId(IDUtils.getLongAgencyId());//设置本代理id
                  agent.setAgentNumber(IDUtils.genItemId()+"");  //设置代理商编号
              }
              else{
                  //跳到错误页面
                  return null;
              }
              //校验费率添加是否合理
             if(loginAgent.getRate()==null||agent.getRate()<loginAgent.getRate()){
                //跳到错误页面
                return "redirect:menu/agent/addAgent";
             }
            agentService.addAgent(agent);
            session.removeAttribute("token");
            return "redirect:http://localhost:8080/brcd/agent/getAgent";
        }
            model.addAttribute("resubmit","您已经提交过了信息了请勿重复提交");
        //跳到错误页面
            return "redirect:menu/agent/initToken";
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
     * 根据省和市得到一个支行名（未完成）
     * @param province
     * @param town
     * @return
     */
    @RequestMapping("/getBankName")
    @ResponseBody
    public List<String> getBankName(String province,String town){
        BankUnionpayNo bankUnionpayNo=new BankUnionpayNo();
        bankUnionpayNo.setBankName("工商银行");
        BankUnionpayNo bankUnionpayNo1=new BankUnionpayNo();
        BankUnionpayNo bankUnionpayNo2=new BankUnionpayNo();
        BankUnionpayNo bankUnionpayNo3=new BankUnionpayNo();
        BankUnionpayNo bankUnionpayNo4=new BankUnionpayNo();
        bankUnionpayNo1.setBankName("农业银行");
        bankUnionpayNo2.setBankName("建设银行");
        bankUnionpayNo3.setBankName("中国银行");
        bankUnionpayNo4.setBankName("交通银行");
       List<String> bankNames=new ArrayList<>();
       bankNames.add(bankUnionpayNo.getBankName());bankNames.add(bankUnionpayNo1.getBankName());bankNames.add(bankUnionpayNo2.getBankName());bankNames.add(bankUnionpayNo3.getBankName());bankNames.add(bankUnionpayNo4.getBankName());
       return bankNames;
    }

    /**
     * 根据支行名查询行号（未完成）
     * @param bankName
     * @return
     */
    @RequestMapping("/getUnionpayNo")
    @ResponseBody
    public String getUnionpayNo(String bankName,String province,String town){

        return IDUtils.genItemId()+"";
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
        model.addAttribute("rates",agentService.lookUpWork("shareBenefit"));  //分润权限
        model.addAttribute("tAndOs",agentService.lookUpWork("tAndOStatus"));  //t+o
        model.addAttribute("roles", agentService.lookUpWork("role"));   //角色
        model.addAttribute("userTypes",agentService.lookUpWork("userType")); //用户类型
        model.addAttribute("yeOrNoKts", agentService.lookUpWork("whetherDredge")); //是否开通0
        TbAgent agent = findOneAgent(id);
        model.addAttribute("showAgent",agent);
        session.setAttribute("updateToken",Uid.getUuid());
        return "menu/agent/updateAgent";
    }
    @RequestMapping("/updateAgent")
    public String updateAgent(TbAgent agent,HttpSession session,String token){
             String updateToken=(String) session.getAttribute("updateToken");
             System.out.println(updateToken+"                "+token);
             if(updateToken!=null&&updateToken.equals(token)){
                 agentService.updateAgent(agent);
                 session.removeAttribute("updateToken");
                 return "redirect:http://localhost:8080/brcd/agent/getAgent";
             }
//跳到错误页面
               return null;
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
    @RequestMapping("/toSelectAgent")
    public String toSelectAgent(){
        return "menu/agent/select";
    }

}
