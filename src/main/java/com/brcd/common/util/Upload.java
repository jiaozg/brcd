package com.brcd.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @action 文件上传工具类
 * @user 白雪杰
 * @date 2017年6月26日
 */
@Component
public class Upload {
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;//IP地址
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;//端口号
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;//用户名
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;//密码
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;//ftp的图片服务器根路径
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;//#ftp图片服务器的url
	@Value("${IMAGEPATH}")
	private String IMAGEPATH;//#ftp图片服务器的url
	/**
	 * 单文件上传
	 * @param file （文件）
	 * @return newName （文件名）
	 * @throws Exception
	 */
	public  String getUpload(MultipartFile file) throws Exception {
		String newName="";
		if (file != null) {
			String oldName = file.getOriginalFilename();//取出原始文件名
			newName= IDUtils.genItemId();//随机生成一个毫秒数
			if (oldName.indexOf(".") != -1) {
				newName = newName + oldName.substring(oldName.indexOf("."));
				boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, IMAGEPATH, newName, file.getInputStream());
			}
		}
		return FTP_ADDRESS +":"+FTP_PORT+"/"+newName;
	}


}
