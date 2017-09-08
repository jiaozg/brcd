package com.brcd.common.util;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by zhanghui on 20/04/2017.
 */

public class HttpClientMultiThreadJSONUtil {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String apiURL = "";
    private HttpClient httpClient = null;
    private HttpPost method = null;
    private long startTime = 0L;
    private long endTime = 0L;
    private int status = 0;

    public HttpClientMultiThreadJSONUtil(String url) {
        if (url != null) {
            this.apiURL = url;
        }

        if (this.apiURL != null) {
            this.httpClient = new DefaultHttpClient();
            this.method = new HttpPost(this.apiURL);
        }

    }

    public String sendJsonPost(String jsonParamsStr, Logger log) {
        if (log == null) {
            log = this.logger;
        }

        String body = null;
        log.info("parameters:" + jsonParamsStr);
        if (this.method != null & jsonParamsStr != null && !"".equals(jsonParamsStr.trim())) {
            try {
                ArrayList e = new ArrayList();
                e.add(new BasicNameValuePair("json", jsonParamsStr));
                this.method.setEntity(new StringEntity(jsonParamsStr, Charset.forName("UTF-8")));
                this.startTime = System.currentTimeMillis();
                HttpResponse response = this.httpClient.execute(this.method);
                this.endTime = System.currentTimeMillis();
                int statusCode = response.getStatusLine().getStatusCode();
                log.info("statusCode:" + statusCode);
                log.info("调用API 花费时间(单位：毫秒)：" + (this.endTime - this.startTime));
                if (statusCode != 200) {
                    log.error("Method failed:" + response.getStatusLine());
                    this.status = 1;
                }

                body = EntityUtils.toString(response.getEntity());
            } catch (IOException var10) {
                log.error("exception occurred!\n" + ExceptionUtils.getFullStackTrace(var10));
                this.status = 3;
            } finally {
                log.info("调用接口状态：" + this.status);
            }
        }

        return body;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

}
