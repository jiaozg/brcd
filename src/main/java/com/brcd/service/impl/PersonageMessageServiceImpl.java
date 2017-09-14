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

    //查询出来修的个人信息
    @Override
    public TbAgent queryAgentMsg(TbAgent tbAgent) {
        if (tbAgent != null) {
            TbAgent queryAgentMsg = personageMessageMapper.queryAgentMsg(tbAgent);
            if (queryAgentMsg != null) {
                return queryAgentMsg;
            }
        }
        return null;
    }

    //修改个人信息
    @Override
    public void updatePersonageMsg(TbAgent tbAgent) {
        if (tbAgent != null) {
            personageMessageMapper.updatePersonageMsg(tbAgent);
        }
    }

    //验证密码
    @Override
    public TbAgent checkPassword(TbAgent tbAgent) {
        TbAgent checkPassword = null;
        if (tbAgent.getPassword() != null && tbAgent.getPassword() != "") {
            String md5Encode = MD5Util.MD5Encode(tbAgent.getPassword());
            tbAgent.setPassword(md5Encode);
        }
        checkPassword = personageMessageMapper.checkPassword(tbAgent);
        return checkPassword;
    }

    //修改密码
    @Override
    public void updatePassword(TbAgent tbAgent) {
        if (tbAgent != null && tbAgent.getPassword() != null && tbAgent.getPassword() != "") {
            String md5Encode = MD5Util.MD5Encode(tbAgent.getPassword());
            tbAgent.setPassword(md5Encode);
        }
        personageMessageMapper.updatePassword(tbAgent);
    }
}
