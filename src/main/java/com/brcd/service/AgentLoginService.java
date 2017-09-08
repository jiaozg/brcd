package com.brcd.service;

import com.brcd.bean.TbAgent;

/**
 * Created by 任彩雨 on 2017/9/5.
 */

public interface AgentLoginService {

    TbAgent AgentLogin(TbAgent tbAgent);//代理商登录

    void updateDateIp(TbAgent tbAgent);//修改登录Ip和时间
}
