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

    @Override
    public FtpMsg getFtpMsg() {
        FtpMsg ftpMsg = ftpMsgMapper.getFtpMsg();
        return ftpMsg;
    }

    @Override
    public FtpMsg checkFtpUserName(FtpMsg ftpMsg) {
        FtpMsg checkFtpUserName = ftpMsgMapper.checkFtpUserName(ftpMsg);
        return checkFtpUserName;
    }

    @Override
    public FtpMsg checkFtpPassword(FtpMsg ftpMsg) {
        FtpMsg checkFtpPassword = ftpMsgMapper.checkFtpPassword(ftpMsg);
        return checkFtpPassword;
    }

    @Override
    public void updateFtpUserNamePwd(FtpMsg ftpMsg) {
        ftpMsgMapper.updateFtpUserNamePwd(ftpMsg);
    }


}
