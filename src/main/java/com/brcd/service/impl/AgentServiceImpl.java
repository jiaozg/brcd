package com.brcd.service.impl;

import com.brcd.bean.*;
import com.brcd.common.util.MD5Util;
import com.brcd.mapper.AgentMapper;
import com.brcd.service.AgentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 代理商管理(serivec层)实现类
 * Created by 韩明泽 on 2017/9/5.
 */
@Service

public class AgentServiceImpl implements AgentService{
    @Autowired
    private AgentMapper agentMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<TbAgent> findAll() {

        return agentMapper.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Page<TbAgent> getAgent(TbAgent agent, int pageNo, int pageSize, HttpSession session) {
        //调用分页插件
        PageHelper.startPage(pageNo,pageSize);
        //取登陆后的session对象
        TbAgent loginAgent=(TbAgent) session.getAttribute("agentLogin");
        if(loginAgent!=null && loginAgent.getId()!=null){
            agent.setId(loginAgent.getId());
        }
        return  agentMapper.getAgent(agent);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public TbAgent findAgentById(Long id) {
        return agentMapper.findAgentById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void addAgent(TbAgent agent) {

       agentMapper.addAgent(agent);
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void updateAgent(TbAgent agent) {
        if(agent!=null&&agent.getPassword()!=null&&!agent.getPassword().equals("")){
            agent.setPassword(MD5Util.MD5Encode(agent.getPassword()));
        }
        agentMapper.updateAgent(agent);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<TbDictionary> lookUpWork(String dictDataKey) {
        return agentMapper.lookUpWork(dictDataKey);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<AgentTree> classificationQuery(Long id) {
        List<AgentTree> list=agentMapper.classificationQuery(id);
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<String> getRegisterCardProvinces() {
        List<Bank> result=agentMapper.getRegisterCardProvinces();
        List<String> provinces=new ArrayList<>();
        if (result!=null&&result.size()>0){
            for (int i=0;i<result.size();i++){
              provinces.add(result.get(i).getProvince());
            }
        }
        return provinces;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<String> getRegisterCardCity(Bank bank) {
        List<Bank> result=agentMapper.getRegisterCardCity(bank);
        List<String> cities=new ArrayList<>();
        if (result!=null&&result.size()>0){
            for (int i=0;i<result.size();i++){
                cities.add(result.get(i).getCity());
            }
        }
        return cities;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<String> getSubBranchBank(Bank bank) {
        List<Bank> result=agentMapper.getSubBranchBank(bank);
        List<String> bankSubNames=new ArrayList<>();
        if (result!=null&&result.size()>0){
            for (int i=0;i<result.size();i++){
                bankSubNames.add(result.get(i).getBankSubName());
            }
        }
        return bankSubNames;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<String> getUnionpayNo(Bank bank) {
        List<Bank> result=agentMapper.getUnionpayNo(bank);
        List<String> unionpayNos=new ArrayList<>();
        if (result!=null&&result.size()>0){
            for (int i=0;i<result.size();i++){
                unionpayNos.add(result.get(i).getBankNo());
            }
        }
        return unionpayNos;
    }

    @Override
    public List<ExportAgent> getAgentForExl(TbAgent agent) {
        Page<TbAgent> result=agentMapper.getAgent(agent);
        List<ExportAgent> agents=new ArrayList<>();
        for (int i=0;i<result.size();i++){
            agents.add(new ExportAgent(result.get(i).getAgentNumber(),
                    result.get(i).getShortName(),result.get(i).getAgentContactPhone(),
                    result.get(i).getAgentGrade(),result.get(i).getAuditStatus(),
                    result.get(i).getBusinessArea(),result.get(i).getIntoPermissions(),
                    result.get(i).getShareBenefit(),result.get(i).getRate()
                    ));
        }
        return agents;
    }

}
