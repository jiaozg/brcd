package com.brcd.service.impl;

import com.brcd.bean.TbAgent;
import com.brcd.mapper.PersonageMessageMapper;
import com.brcd.service.PersonageMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 任彩雨 on 2017/9/5.
 */
@Service
public class PersonageMessageServiceImpl implements PersonageMessageService {
    @Autowired
    private PersonageMessageMapper personageMessageMapper;


    @Override
    public TbAgent queryAgentMsg(TbAgent tbAgent) {
        TbAgent queryAgentMsg = personageMessageMapper.queryAgentMsg(tbAgent);
        return queryAgentMsg;
    }
}
