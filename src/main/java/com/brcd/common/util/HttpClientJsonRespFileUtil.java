package com.brcd.common.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

/**
 * HttpClient4 请求类</ br> 使用方法：</ br> HttpclientMultiThreadJSONUtil httpclient =
 * new HttpclientMultiThreadJSONUtil(url);
 * httpclient.sendJsonPostDownloadFile(jsonParamsStr, path, encode, log);</ br>
 * 
 * @author zhang.hui@pufubao.net
 * @date 2017年2月14日 下午2:13:57
 * @version v1.0
 */
public class HttpClientJsonRespFileUtil {

	// 接口地址
	private String apiURL = "";
	private HttpClient httpClient = null;
	private HttpPost method = null;
	private long startTime = 0L;
	private long endTime = 0L;
	/** 0.成功 1.执行方法失败 2.协议错误 3.网络错误 */
	private int status = 0;

	/**
	 * 接口地址
	 * 
	 * @param url
	 *            请求地址
	 */
	public HttpClientJsonRespFileUtil(String url) {
		if (url != null) {
			this.apiURL = url;
		}
		if (apiURL != null) {
			httpClient = new DefaultHttpClient();
			method = new HttpPost(apiURL);
		}
	}

	/**
	 * 发送post请求， 数据格式JSON
	 * 
	 * @param jsonParamsStr
	 *            json格式的数据
	 * @return file
	 * @author zhang.hui@pufubao.net
	 * @date 2017年2月14日 下午2:22:11
	 */
	public String sendJsonPostDownloadFile(String jsonParamsStr, String path, String encode) {
		String body = null;
		System.out.println("parameters:" + jsonParamsStr);
		if (method != null & jsonParamsStr != null && !"".equals(jsonParamsStr.trim())) {
			System.out.println("path:" + path);
			HttpClient client = null;
			try {
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				// 建立一个NameValuePair数组，用于存储欲传送的参数
				params.add(new BasicNameValuePair("json", jsonParamsStr));
				// 添加参数
				method.setEntity(new StringEntity(jsonParamsStr, Charset.forName(HTTP.UTF_8)));
				// 请求开始执行时间
				startTime = System.currentTimeMillis();
				// 设置编码
				HttpResponse response = httpClient.execute(method);
				// 请求结束时间
				endTime = System.currentTimeMillis();
				// 请求状态
				int statusCode = response.getStatusLine().getStatusCode();
				System.out.println("statusCode:" + statusCode);
				System.out.println("调用API 花费时间(单位：毫秒)：" + (endTime - startTime));
				if (statusCode != HttpStatus.SC_OK) {
					System.out.println("Method failed:" + response.getStatusLine());
					status = 1;
				}
				// 如果成功
				if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
					byte[] result = EntityUtils.toByteArray(response.getEntity());
					BufferedOutputStream bw = null;
					try {
						// 创建文件对象
						File f = new File(path);
						// 创建文件路径
						if (!f.getParentFile().exists())
							f.getParentFile().mkdirs();
						// 写入文件
						bw = new BufferedOutputStream(new FileOutputStream(path));
						bw.write(result);
					} catch (Exception e) {
						System.out.println("保存文件错误,path=" + path + "; error=" + e);
					} finally {
						try {
							if (bw != null)
								bw.close();
						} catch (Exception e) {
							System.out.println("finally BufferedOutputStream shutdown close: " + e);
						}
					}
				}
				// 如果失败
				else {
					StringBuffer errorMsg = new StringBuffer();
					errorMsg.append("httpStatus:");
					errorMsg.append(response.getStatusLine().getStatusCode());
					errorMsg.append(response.getStatusLine().getReasonPhrase());
					errorMsg.append(", Header: ");
					Header[] headers = response.getAllHeaders();
					for (Header header : headers) {
						errorMsg.append(header.getName());
						errorMsg.append(":");
						errorMsg.append(header.getValue());
					}
					System.out.println("HttpResonse Error:" + errorMsg);

				}
			} catch (ClientProtocolException e) {
				System.out.println();
				System.out.println("下载文件保存到本地,http连接异常,path=" + path + ";error=" + e);
			} catch (IOException e) {
				System.out.println("下载文件保存到本地,文件操作异常,path=" + path + "; error=" + e);
			} finally {
				try {
					if (client != null) {
						client.getConnectionManager().shutdown();
					}
				} catch (Exception e) {
					System.out.println("finally HttpClient shutdown error: " + e);
				}
			}

		}
		return body;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
}
