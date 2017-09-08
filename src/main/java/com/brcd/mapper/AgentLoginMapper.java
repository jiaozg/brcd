package com.brcd.mapper;


import com.brcd.bean.TbAgent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by 任彩雨 on 2017/9/5.
 */
@Component
@Mapper
public interface AgentLoginMapper {

    TbAgent AgentLogin(TbAgent tbAgent);//代理商登录

    void updateDateIp(TbAgent tbAgent);//修改登录Ip和时间
}
