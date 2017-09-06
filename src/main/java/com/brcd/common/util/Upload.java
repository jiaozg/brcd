package com.brcd.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * @action 文件上传工具类
 * @user 白雪杰
 * @date 2017年6月26日
 */
public class Upload {
	/**
	 * 单文件上传
	 * @param request
	 * @param file （文件集合）
	 * @param url （上传地址）
	 * @return
	 * @throws Exception
	 */
	public static String getUpload(HttpServletRequest request,
			MultipartFile file,String url) throws Exception {
		if (file.getOriginalFilename().length() > 0) {
			String fileName =Uid.getUuid()+ file.getOriginalFilename();
			//System.out.println(fileName);
			File files = new File(url + fileName);
			file.transferTo(files);
			return fileName;
		}
		return null;
	}

	/**
	 * 多文件上传
	 * @param request
	 * @param file （文件集合）
	 * @param url （上传地址）
	 * @return
	 * @throws Exception
	 */
	public static List<String> getUploads(HttpServletRequest request,
			MultipartFile[] file,String url) throws Exception {
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < file.length; i++) {
			if (file[i].getOriginalFilename().length() > 0
					&& file[i].getOriginalFilename() != "") {
				String fileName =  Uid.getUuid() + file[i].getOriginalFilename();
				//System.out.println(fileName);
				list.add(fileName);
				File files = new File(url + fileName);
				file[i].transferTo(files);
			}

		}
		return list;
	}
}
