package com.brcd.mapper;

import com.brcd.bean.FtpMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by 任彩雨 on 2017/9/12.
 */
@Component
@Mapper
public interface FtpMsgMapper {
    FtpMsg getFtpMsg();//查询出来ftp需要的信息

    FtpMsg checkFtpUserName(FtpMsg ftpMsg);//验证用户名

    FtpMsg checkFtpPassword(FtpMsg ftpMsg);//验证密码

    void updateFtpUserNamePwd(FtpMsg ftpMsg);//修改密码
}
