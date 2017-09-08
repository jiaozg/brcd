package com.brcd.common.util;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * httpclient 发送JSON数据工具类
 */
@SuppressWarnings("deprecation")
public class HttpClientJSONUtil {

	private static final String CHARSET_UTF8 = "UTF-8";
	// 接口地址
	private static Logger logger = LoggerFactory
			.getLogger(HttpClientJSONUtil.class);
	// private static final String pattern = "yyyy-MM-dd HH:mm:ss:SSS";
	private static HttpClient httpClient = new DefaultHttpClient();
	private static HttpPost method = null;
	private static long startTime = 0L;
	private static long endTime = 0L;
	/** 0.成功 1.执行方法失败 2.协议错误 3.网络错误 */
	private static int status = 0;

	/**
	 * 发送UTF-8的JSON数据
	 * 
	 * @param url
	 * @param parameters
	 * @return
	 */
	public static String postJSONUTF8(String url, String parameters) {
		method = new HttpPost(url);
		String body = null;
		logger.info("parameters:" + parameters);

		if (method != null & parameters != null
				&& !"".equals(parameters.trim())) {
			try {

				// 建立一个NameValuePair数组，用于存储欲传送的参数
				method.addHeader("Content-type",
						"application/json; charset=utf-8");
				method.setHeader("Accept", "application/json");
				method.setEntity(new StringEntity(parameters, Charset
						.forName(CHARSET_UTF8)));
				startTime = System.currentTimeMillis();

				HttpResponse response = httpClient.execute(method);

				endTime = System.currentTimeMillis();
				int statusCode = response.getStatusLine().getStatusCode();

				logger.info("statusCode:" + statusCode);
				logger.info("调用API 花费时间(单位：毫秒)：" + (endTime - startTime));
				if (statusCode != HttpStatus.SC_OK) {
					logger.error("Method failed:" + response.getStatusLine());
					status = 1;
				}

				// Read the response body
				body = EntityUtils.toString(response.getEntity());

			} catch (IOException e) {
				// 网络错误
				status = 3;
			} finally {
				logger.info("调用接口状态：" + status);
			}

		}
		return body;
	}

}
