package com.brcd.service.impl;


import com.brcd.common.constant.Constant;
import com.brcd.common.util.HttpClientJSONUtil;
import com.brcd.common.util.HttpClientMultiThreadJSONUtil;
import com.brcd.common.util.JSONUtil;
import com.brcd.common.util.StringUtil;
import com.brcd.service.IWechatService;
import com.brcd.vo.base.WechatRequestBase;
import com.brcd.vo.base.WechatResponseBase;
import com.brcd.vo.customer.CustomerReportRequest;
import com.brcd.vo.customer.CustomerReportResponse;
import com.brcd.vo.micro.WechatMicroRequest;
import com.brcd.vo.micro.WechatMicroResponse;
import com.brcd.vo.orderquery.WechatOrderQueryRequest;
import com.brcd.vo.orderquery.WechatOrderQueryResponse;
import com.brcd.vo.scan.WechatScannedRequest;
import com.brcd.vo.scan.WechatScannedResponse;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 微信业务实现
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/1 15:39
 */
@Service
public class WechatServiceImpl implements IWechatService {

    @Override
    public WechatScannedResponse doScanned(WechatScannedRequest scannedRequest, Logger log) {
        // step 1 init param
        WechatScannedResponse scannedResponse = new WechatScannedResponse();
        log.info("请求参数:{}", scannedRequest);
        String brcbGatewayUrl = Constant.BRCB_GATEWAY_URL;
        log.info("请求地址: {}", brcbGatewayUrl);

        // step 2 send json post
        String sendPost = sendJsonPost(brcbGatewayUrl, scannedRequest, scannedResponse, log);
        if (StringUtil.isBlank(sendPost)) {
            return scannedResponse;
        }

        //step 3 covert response
        try {
            scannedResponse = JSONUtil.parseObject(sendPost, WechatScannedResponse.class);
        } catch (Exception e) {
            log.info("转换返回数据异常,信息: {}", e);
            scannedResponse.setReturn_code(Constant.FAIL);
            scannedResponse.setReturn_msg("返回参数转换异常");
            return scannedResponse;
        }
        log.info("强转的对象为: {}", scannedResponse);

        //step 4 return
        return scannedResponse;
    }

    @Override
    public WechatMicroResponse doMicro(WechatMicroRequest microRequest, Logger log) {
        // step 1 init param
        WechatMicroResponse microResponse = new WechatMicroResponse();
        log.info("请求参数:{}", microRequest);
        String brcbGatewayUrl = Constant.BRCB_GATEWAY_URL;
        log.info("请求地址: {}", brcbGatewayUrl);

        long costTimeStart = System.currentTimeMillis();//start
        // step 2 send json post
        String sendPost = sendJsonPost(brcbGatewayUrl, microRequest, microResponse, log);
        if (StringUtil.isBlank(sendPost)) {
            return microResponse;
        }

        //step 3 covert response
        try {
            microResponse = JSONUtil.parseObject(sendPost, WechatMicroResponse.class);
        } catch (Exception e) {
            log.info("转换返回数据异常,信息: {}", e);
            microResponse.setReturn_code(Constant.FAIL);
            microResponse.setReturn_msg("返回参数转换异常");
            return microResponse;
        }
        log.info("强转的对象为: {}", microResponse);

        //step 4 return
        return microResponse;
    }

    @Override
    public WechatOrderQueryResponse doOrderQuery(WechatOrderQueryRequest orderQueryRequest, Logger log) {
        // step 1 init param
        WechatOrderQueryResponse orderQueryResponse = new WechatOrderQueryResponse();
        log.info("请求参数:{}", orderQueryRequest);

        String brcbGatewayUrl = Constant.BRCB_GATEWAY_URL;
        log.info("请求地址: {}", brcbGatewayUrl);

        // step 2 send json post
        String sendPost = sendJsonPost(brcbGatewayUrl, orderQueryRequest, orderQueryResponse, log);
        if (StringUtil.isBlank(sendPost)) {
            return orderQueryResponse;
        }

        //step 3 covert response
        try {
            orderQueryResponse = JSONUtil.parseObject(sendPost, WechatOrderQueryResponse.class);
        } catch (Exception e) {
            log.info("转换返回数据异常,信息: {}", e);
            orderQueryResponse.setReturn_code(Constant.FAIL);
            orderQueryResponse.setReturn_msg("返回参数转换异常");
            return orderQueryResponse;
        }
        log.info("强转的对象为: {}", orderQueryResponse);

        //step 4 return
        return orderQueryResponse;
    }

    /**
     * 商户进件
     *
     * @param customerReportRequest
     * @param log
     * @return
     */
    @Override
    public CustomerReportResponse doBRCBCustomerReport(CustomerReportRequest customerReportRequest, Logger log) {
        CustomerReportResponse response = new CustomerReportResponse();
        Map<String, Object> params = customerReportRequest.toMap();
        String parameters = JSONUtil.toJSONString(params);
        String brcbGteUrl = Constant.BRCB_CUSTOMER_REPORT_URL;
        HttpClientMultiThreadJSONUtil httpclient = new HttpClientMultiThreadJSONUtil(brcbGteUrl);
        String respStr = httpclient.sendJsonPost(parameters, log);
        if (StringUtil.isBlank(respStr)) {
            response.setReturn_code(Constant.FAIL);
            response.setReturn_msg("北农商商户进件返回数据为空");
            log.info("北农商商户进件返回数据：{}", respStr);
            return response;
        }
        try {
            response = JSONUtil.parseObject(respStr, CustomerReportResponse.class);
        } catch (Exception e) {
            response.setReturn_code(Constant.FAIL);
            response.setReturn_msg("北农商商户进件接口返回数据为空");
            log.info("北农商商户进件接口返回数据：{}", respStr);
        }
        return response;
    }


    /**
     * send json post
     *
     * @param url
     * @param requestBase
     * @param responseBase
     * @param log
     * @return
     */
    String sendJsonPost(String url, WechatRequestBase requestBase, WechatResponseBase responseBase, Logger log) {
        String sendPost = null;
        long costTimeStart = System.currentTimeMillis();//start
        try {
            sendPost = HttpClientJSONUtil.postJSONUTF8(url, JSONUtil.toJSONString(requestBase.toMap()));
        } catch (Exception e) {
            log.info("请求出错: {}", e);
            responseBase.setReturn_code(Constant.FAIL);
            responseBase.setReturn_msg("请求出错");
        }
        long costTimeEnd = System.currentTimeMillis();//end
        long totalTimeCost = costTimeEnd - costTimeStart;// 总耗时
        log.info("请求总耗时：{}ms", totalTimeCost);
        log.info("返回数据: {}", sendPost);
        return sendPost;
    }
}
