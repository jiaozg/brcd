package com.brcd.service.impl;

import com.brcd.bean.TbAgent;
import com.brcd.mapper.AgentLoginMapper;
import com.brcd.service.AgentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 任彩雨 on 2017/9/5.
 */
@Service
public class AgentLoginServiceImpl implements AgentLoginService {
    @Autowired
    private AgentLoginMapper agentLoginMapper;

    @Override
    public TbAgent AgentLogin(TbAgent tbAgent) {
        TbAgent agentLogin = agentLoginMapper.AgentLogin(tbAgent);
        return agentLogin;
    }
}
