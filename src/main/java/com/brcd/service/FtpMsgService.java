package com.brcd.service;

import com.brcd.bean.FtpMsg;

/**
 * Created by 任彩雨 on 2017/9/12.
 */
public interface FtpMsgService {
    FtpMsg getFtpMsg();//查询出来ftp需要的信息

    FtpMsg checkFtpUserName(FtpMsg ftpMsg);//验证用户名

    FtpMsg checkFtpPassword(FtpMsg ftpMsg);//验证密码

    void updateFtpUserNamePwd(FtpMsg ftpMsg);//修改FTP用户名密码
}
