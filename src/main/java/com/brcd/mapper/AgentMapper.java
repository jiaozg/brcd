package com.brcd.mapper;

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
}
