package com.brcd.service;

import com.brcd.bean.*;
import com.github.pagehelper.Page;

import javax.servlet.http.HttpSession;
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
    Page<TbAgent> getAgent(TbAgent agent, int pageNo, int pageSize, HttpSession session);

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

    /**
     * 修改代理商详细信息
     * @param agent
     */
    void updateAgent(TbAgent agent);
    /**
     * 查找数据字典
     * @param dictDataKey
     * @return
     */
    List<TbDictionary> lookUpWork(String dictDataKey);
    /**
     * 分级查询
     * @param id
     * @return
     */
    List<AgentTree> classificationQuery(Long id);
    /**
     * 查询所有的省份
     * @return
     */
    List<String> getRegisterCardProvinces();

    /**
     * 根据省查询市
     * @param bank
     * @return
     */
    List<String> getRegisterCardCity(Bank bank);

    /**
     * 根据省、市查询支行
     * @param bank
     *
     * @return
     */
    List<String> getSubBranchBank(Bank bank);
    /**
     * 根据省、市、支行查询银联号
     * @param bank
     *
     *
     * @return
     */

    List<String> getUnionpayNo(Bank bank);

    /**
     * 导出数据
     * @param agent
     * @return
     */
    List<ExportAgent> getAgentForExl(TbAgent agent);
}
