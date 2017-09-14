package com.brcd.mapper;

import com.brcd.bean.AgentTree;
import com.brcd.bean.Bank;
import com.brcd.bean.TbDictionary;
import com.brcd.bean.TbAgent;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 代理商管理持久层
 * Created by 韩明泽 on 2017/9/5.
 */
@Mapper
@Repository
public interface AgentMapper {
  /**
   * 测试
   * @return
   */
  List<TbAgent> findAll();

  /**
   * 查询所有代理上信息
   * @return
   */
  Page<TbAgent> getAgent(TbAgent agent);
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
   * @param pid
   * @return
   */
   List<AgentTree> classificationQuery(Long pid);

  /**
   * 查询所有的省份
   * @return
   */
   List<Bank> getRegisterCardProvinces();

  /**
   * 根据省查询市
   * @param bank
   * @return
   */
  List<Bank> getRegisterCardCity(Bank bank);

  /**
   * 根据省、市查询支行
   * @param bank
   * @return
   */
  List<Bank> getSubBranchBank(Bank bank);

  /**
   * 根据省、市、支行查询银联号
   * @param bank
   * @return
   */

  List<Bank> getUnionpayNo(Bank bank);
}
