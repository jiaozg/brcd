package com.brcd.service.impl;

import com.brcd.bean.TbAgent;
import com.brcd.common.util.MD5Util;
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

    @Override
    public void updatePersonageMsg(TbAgent tbAgent) {
        personageMessageMapper.updatePersonageMsg(tbAgent);
    }

    @Override
    public TbAgent checkPassword(TbAgent tbAgent) {
        String md5Encode = MD5Util.MD5Encode(tbAgent.getPassword());
        tbAgent.setPassword(md5Encode);
        TbAgent checkPassword = personageMessageMapper.checkPassword(tbAgent);
        return checkPassword;
    }

    @Override
    public void updatePassword(TbAgent tbAgent) {
        String md5Encode = MD5Util.MD5Encode(tbAgent.getPassword());
        tbAgent.setPassword(md5Encode);
        personageMessageMapper.updatePassword(tbAgent);
    }
}
