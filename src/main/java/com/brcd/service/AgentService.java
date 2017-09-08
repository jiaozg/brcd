package com.brcd.service;

import com.brcd.bean.TbAgent;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 代理商管理业务层(serivce)
 * Created by admin on 2017/9/5.
 */
public interface AgentService {
    /**
     * 测试
     * @return
     */
    List<TbAgent> findAll();

    /**
     * 查询所有代理商信息
     * @return
     */
    Page<TbAgent> getAgent(TbAgent agent, int pageNo, int pageSize);

    /**
     * 根据id查询代理商详细信息
     * @param id
     * @return
     */
    TbAgent findAgentById(Long id);
    /**
     * 添加新的代理商
     * @param agent
     */
    void addAgent(TbAgent agent);
}
