package com.brcd.service.impl;

import com.brcd.bean.FtpMsg;
import com.brcd.mapper.FtpMsgMapper;
import com.brcd.service.FtpMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 任彩雨 on 2017/9/12.
 */
@Service
public class FtpMsgServiceImpl implements FtpMsgService {
    @Autowired
    private FtpMsgMapper ftpMsgMapper;

    //得到FTP的信息
    @Override
    public FtpMsg getFtpMsg() {
        FtpMsg ftpMsg = ftpMsgMapper.getFtpMsg();
        return ftpMsg;
    }

    //验证FTP用户名
    @Override
    public FtpMsg checkFtpUserName(FtpMsg ftpMsg) {
        FtpMsg checkFtpUserName = null;
        if (ftpMsg != null && ftpMsg.getFtpUserName() != null && ftpMsg.getFtpUserName() != "") {
            checkFtpUserName = ftpMsgMapper.checkFtpUserName(ftpMsg);
        }
        return checkFtpUserName;
    }

    //验证FTP密码
    @Override
    public FtpMsg checkFtpPassword(FtpMsg ftpMsg) {
        FtpMsg checkFtpPassword = null;
        if (ftpMsg != null && ftpMsg.getFtpPassword() != null && ftpMsg.getFtpPassword() != "") {
            checkFtpPassword = ftpMsgMapper.checkFtpPassword(ftpMsg);
        }
        return checkFtpPassword;
    }

    //实现修改FTP用户名密码
    @Override
    public void updateFtpUserNamePwd(FtpMsg ftpMsg) {
        if (ftpMsg != null && ftpMsg.getFtpUserName() != null && ftpMsg.getFtpPassword() != null) {
            ftpMsgMapper.updateFtpUserNamePwd(ftpMsg);
        }
    }


}
