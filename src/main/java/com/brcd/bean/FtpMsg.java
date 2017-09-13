package com.brcd.bean;

import com.brcd.service.FtpMsgService;
import com.brcd.service.impl.FtpMsgServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 任彩雨 on 2017/9/12.
 */
@Data
public class FtpMsg {

    private Integer pid;
    private String ftpAddress;
    private int ftpPort;
    private String ftpUserName;
    private String ftpPassword;
    private String ftpBasePath;//服务器存储的路径
    private String ftpImageBaseUrl;//
    private String ftpImagePath;


}
