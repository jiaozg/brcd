package com.brcd.service.impl;

import com.brcd.bean.TbAgent;
import com.brcd.mapper.AgentMapper;
import com.brcd.service.AgentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 代理商管理(serivec层)实现类
 * Created by 韩明泽 on 2017/9/5.
 */
@Service
@Transactional
public class AgentServiceImpl implements AgentService{
    @Autowired
    private AgentMapper agentMapper;

    @Override
    public List<TbAgent> findAll() {

        return agentMapper.findAll();
    }

    @Override
    public Page<TbAgent> getAgent(TbAgent agent, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);

        return  agentMapper.getAgent(agent);
    }

    @Override
    public TbAgent findAgentById(Long id) {
        return agentMapper.findAgentById(id);
    }

    @Override
    public void addAgent(TbAgent agent) {
       agentMapper.addAgent(agent);
    }
}
