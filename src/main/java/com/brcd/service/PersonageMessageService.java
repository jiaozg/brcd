package com.brcd.service;

import com.brcd.bean.TbAgent;

/**
 * Created by 任彩雨 on 2017/9/5.
 */
public interface PersonageMessageService {

    TbAgent queryAgentMsg(TbAgent tbAgent);//查看个人信息并修改

    void updatePersonageMsg(TbAgent tbAgent);//修改个人信息

    TbAgent checkPassword(TbAgent tbAgent);//验证旧密码

    void updatePassword(TbAgent tbAgent);//修改并保存密码
}
