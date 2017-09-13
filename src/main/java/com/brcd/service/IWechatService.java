package com.brcd.service;


import com.brcd.vo.customer.CustomerReportRequest;
import com.brcd.vo.customer.CustomerReportResponse;
import com.brcd.vo.micro.WechatMicroRequest;
import com.brcd.vo.micro.WechatMicroResponse;
import com.brcd.vo.orderquery.WechatOrderQueryRequest;
import com.brcd.vo.orderquery.WechatOrderQueryResponse;
import com.brcd.vo.scan.WechatScannedRequest;
import com.brcd.vo.scan.WechatScannedResponse;
import org.slf4j.Logger;

import java.util.Map;

/**
 * WechatService Interface
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/1 15:38
 */
public interface IWechatService {


    /**
     * 执行扫码请求
     *
     * @param scannedRequest
     * @param log
     * @return
     */
    WechatScannedResponse doScanned(WechatScannedRequest scannedRequest, Logger log);

    /**
     * 执行刷卡(小额)请求
     *
     * @param microRequest
     * @param log
     * @return
     */
    WechatMicroResponse doMicro(WechatMicroRequest microRequest, Logger log);

    /**
     * 执行订单查询请求
     *
     * @param orderQueryRequest
     * @param log
     * @return
     */
    WechatOrderQueryResponse doOrderQuery(WechatOrderQueryRequest orderQueryRequest, Logger log);

    /**
     * 商户进件
     *
     * @param customerReportRequest
     * @param log
     * @return
     */
    CustomerReportResponse doBRCBCustomerReport(CustomerReportRequest customerReportRequest, Logger log);
}
