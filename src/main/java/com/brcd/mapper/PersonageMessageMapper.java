package com.brcd.mapper;

import com.brcd.bean.TbAgent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by 任彩雨 on 2017/9/5.
 */
@Component
@Mapper
public interface PersonageMessageMapper {

    TbAgent queryAgentMsg(TbAgent tbAgent);//查看个人信息并修改
}
