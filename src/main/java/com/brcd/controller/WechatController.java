package com.brcd.controller;


import com.brcd.common.constant.Constant;
import com.brcd.common.util.DateUtil;
import com.brcd.common.util.JSONUtil;
import com.brcd.common.util.RandomUtil;
import com.brcd.service.IWechatService;
import com.brcd.vo.micro.WechatMicroRequest;
import com.brcd.vo.micro.WechatMicroResponse;
import com.brcd.vo.orderquery.WechatOrderQueryRequest;
import com.brcd.vo.orderquery.WechatOrderQueryResponse;
import com.brcd.vo.scan.WechatScannedRequest;
import com.brcd.vo.scan.WechatScannedResponse;
import com.brcd.vo.webpay.WechatWebPayRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@Controller
@RequestMapping("/wechat")
public class WechatController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IWechatService wechatService;


    /**
     * 跳转到微信支付扫码页面
     */
     @RequestMapping("/goToIndex")
     public String goToIndex(){
         return "index";
     }

    /**
     * 扫码参数
     *
     * @param request
     * @return
     */
    @RequestMapping("/scan_param")
    public String scanParam(HttpServletRequest request) {
        Date now = new Date();
        String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_SCANNED;
        String appid = "";
        String mch_id = Constant.BRCB_MCH_ID;//商户ID
        String out_trade_no = RandomUtil.getOrderNum(Constant.ORDER_PREFIX);
        String device_info = "SN1234567890098765";
        String body = "Ipad_mini_16G_白色";
        String detail = null;
        String attach = "北京分店";
        String fee_type = Constant.BRCB_FEE_TYPE;
        String total_fee = request.getParameter("total_fee");//支付金额
        String spbill_create_ip = null;
        try {
            spbill_create_ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String notify_url = Constant.BRCB_NOTIFY_URL;
        String time_start = DateUtil.format(now, DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String time_expire = DateUtil.format(DateUtil.addMinutes(now, 10), DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String op_user_id = mch_id;
        String goods_tag = Constant.BRCB_ORDER_TYPE_WECHAT;
        String product_id = RandomUtil.getRandomStringByLength(10);
        String nonce_str = RandomUtil.randomUUID();
        String limit_pay = "";
        WechatScannedRequest scannedRequest = new WechatScannedRequest(key, service_type, appid, mch_id, device_info, nonce_str, body, detail, attach, out_trade_no, fee_type, total_fee, spbill_create_ip, time_start, time_expire, op_user_id, goods_tag, notify_url, product_id, limit_pay, log);

        request.setAttribute("key", key);
        request.setAttribute("scan", scannedRequest);
        log.info("===> scannedResponse: {}", JSONUtil.toJSONString(scannedRequest));
        return "forward:/scan";
    }

    /**
     * 扫码请求
     *
     * @param request
     * @return
     */
    @RequestMapping("/scan")
    public String scan(HttpServletRequest request) {
        /*String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_SCANNED;
        String appid = "";
        String mch_id = Constant.BRCB_MCH_ID;
        String out_trade_no = request.getParameter("out_trade_no");
        String device_info = request.getParameter("device_info");
        String body = request.getParameter("body");
        String detail = request.getParameter("detail");
        String attach = request.getParameter("attach");
        String fee_type =String.valueOf(request.getParameter("fee_type"));
        String total_fee = request.getParameter("total_fee");
        String spbill_create_ip = request.getParameter("spbill_create_ip");
        String notify_url = Constant.BRCB_NOTIFY_URL;
        String time_start = request.getParameter("time_start");
        String time_expire = request.getParameter("time_expire");
        String op_user_id = mch_id;
        String goods_tag = request.getParameter("goods_tag");
        String product_id = request.getParameter("product_id");
        String nonce_str = request.getParameter("nonce_str");
        String limit_pay = request.getParameter("limit_pay");*/
        Date now = new Date();
        String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_SCANNED;
        String appid = "";
        String mch_id = Constant.BRCB_MCH_ID;//商户ID
        String out_trade_no = RandomUtil.getOrderNum(Constant.ORDER_PREFIX);
        String device_info = "SN1234567890098765";
        String body = "Ipad_mini_16G_白色";
        String detail = null;
        String attach = "北京分店";
        String fee_type = Constant.BRCB_FEE_TYPE;
        String total_fee = request.getParameter("total_fee");//支付金额
        String spbill_create_ip = null;
        try {
            spbill_create_ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String notify_url = Constant.BRCB_NOTIFY_URL;
        String time_start = DateUtil.format(now, DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String time_expire = DateUtil.format(DateUtil.addMinutes(now, 10), DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String op_user_id = mch_id;
        String goods_tag = Constant.BRCB_ORDER_TYPE_WECHAT;
        String product_id = RandomUtil.getRandomStringByLength(10);
        String nonce_str = RandomUtil.randomUUID();
        String limit_pay = "";
        WechatScannedRequest scannedRequest = new WechatScannedRequest(key, service_type, appid, mch_id, device_info, nonce_str, body, detail, attach, out_trade_no, fee_type, total_fee, spbill_create_ip, time_start, time_expire, op_user_id, goods_tag, notify_url, product_id, limit_pay, log);

        request.setAttribute("key", key);
        request.setAttribute("scan", scannedRequest);
        log.info("===> scannedResponse: {}", JSONUtil.toJSONString(scannedRequest));


        //WechatScannedRequest scannedRequest = new WechatScannedRequest(key, service_type, appid, mch_id, device_info, nonce_str, body, detail, attach, out_trade_no, fee_type, total_fee, spbill_create_ip, time_start, time_expire, op_user_id, goods_tag, notify_url, product_id, limit_pay, log);
        WechatScannedResponse scannedResponse = wechatService.doScanned(scannedRequest, log);
        request.setAttribute("scan", scannedResponse);
        return "wechat/scan/scan_qrcode";
    }

    /**
     * 刷卡(小额)参数
     *
     * @param request
     * @return
     */
    @RequestMapping("/micro_param")
    public String microParam(HttpServletRequest request) {
        Date now = new Date();
        String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_MICRO;
        String appid = "";
        String mch_id = Constant.BRCB_MCH_ID;
        String out_trade_no = RandomUtil.getOrderNum(Constant.ORDER_PREFIX);
        String device_info = "SN1234567890098765";
        String body = "Ipad_mini_16G_白色";
        String detail = null;
        String attach = "北京分店";
        String fee_type = Constant.BRCB_FEE_TYPE;
        String total_fee = String.valueOf(1);
        String spbill_create_ip = null;
        try {
            spbill_create_ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String time_start = DateUtil.format(now, DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String time_expire = DateUtil.format(DateUtil.addMinutes(now, 10), DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String op_user_id = mch_id;
        String goods_tag = Constant.BRCB_ORDER_TYPE_WECHAT;
        String product_id = RandomUtil.getRandomStringByLength(10);
        String nonce_str = RandomUtil.randomUUID();
        String limit_pay = "";
        String auth_code = "";

        WechatMicroRequest microRequest = new WechatMicroRequest(key, service_type, appid, mch_id, nonce_str, out_trade_no, auth_code, body, total_fee, attach, detail, device_info, fee_type, goods_tag, product_id, spbill_create_ip, op_user_id, time_expire, time_start, log);
        request.setAttribute("key", key);
        request.setAttribute("micro", microRequest);
        log.info("===> microRequest: {}", JSONUtil.toJSONString(microRequest));
        return "wechat/micro/micro_param";
    }

    /**
     * 刷卡(小额)请求
     *
     * @param request
     * @return
     */
    @RequestMapping("/micro")
    public String micro(HttpServletRequest request) {
        String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_MICRO;
        String appid = request.getParameter("appid");
        String mch_id = Constant.BRCB_MCH_ID;
        String out_trade_no = request.getParameter("out_trade_no");
        String device_info = request.getParameter("device_info");
        String body = request.getParameter("body");
        String detail = request.getParameter("detail");
        String attach = request.getParameter("attach");
        String fee_type = request.getParameter("fee_type");
        String total_fee = String.valueOf(1);
        String spbill_create_ip = request.getParameter("spbill_create_ip");
        String time_start = request.getParameter("time_start");
        String time_expire = request.getParameter("time_expire");
        String op_user_id = mch_id;
        String goods_tag = request.getParameter("goods_tag");
        String product_id = request.getParameter("product_id");
        String nonce_str = request.getParameter("nonce_str");
        String auth_code = request.getParameter("auth_code");
        WechatMicroRequest microRequest = new WechatMicroRequest(key, service_type, appid, mch_id, nonce_str, out_trade_no, auth_code, body, total_fee, attach, detail, device_info, fee_type, goods_tag, product_id, spbill_create_ip, op_user_id, time_expire, time_start, log);
        WechatMicroResponse microResponse = wechatService.doMicro(microRequest, log);
        request.setAttribute("micro", microResponse);
        return "wechat/micro/micro_result";
    }


    /**
     * 公众号入口
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/createWechatQrcodeUrl")
    public String createWechatQrcodeUrl(HttpServletRequest request) throws Exception {
        String mch_id = Constant.BRCB_MCH_ID;
        StringBuilder sb = new StringBuilder();
        sb.append(Constant.DOMAIN_NAME);// 域名
        sb.append("/wechat/wechatWebPayEntry").append("?");// action
        sb.append("customerNum=").append(mch_id);
        request.setAttribute("url", sb.toString());
        return "wechat/webpay/webpay_qrcode";
    }

    /**
     * 公众号请求数据
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/wechatWebPayEntry")
    public String wechatWebPayEntry(HttpServletRequest request) throws Exception {

        String customerNum = request.getParameter("customerNum");

        Date now = new Date();
        String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_WEBPAY;
        String appid = "";
        String openid = "";
        String mch_id = customerNum;
        String out_trade_no = RandomUtil.getOrderNum(Constant.ORDER_PREFIX);
        String device_info = "SN1234567890098765";
        String body = "Ipad_mini_16G_白色";
        String detail = null;
        String attach = "北京分店";
        String fee_type = Constant.BRCB_FEE_TYPE;
        String total_fee = String.valueOf(1);
        String spbill_create_ip = null;
        try {
            spbill_create_ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String notify_url = Constant.BRCB_NOTIFY_URL;
        String time_start = DateUtil.format(now, DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String time_expire = DateUtil.format(DateUtil.addMinutes(now, 10), DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String op_user_id = mch_id;
        String goods_tag = Constant.BRCB_ORDER_TYPE_WECHAT;
        String product_id = RandomUtil.getRandomStringByLength(10);
        String nonce_str = RandomUtil.randomUUID();
        String limit_pay = "";
        String callback_url = Constant.BRCB_CALLBACK_URL;
        WechatWebPayRequest webPayRequest = new WechatWebPayRequest(key, service_type, appid, mch_id,
                out_trade_no, device_info, body, detail, attach, fee_type, total_fee, spbill_create_ip,
                notify_url, time_start, time_expire, op_user_id, goods_tag, product_id, limit_pay,
                nonce_str, openid, callback_url, log);

        // 放值
        request.setAttribute("key", key);
        request.setAttribute("webpay", webPayRequest);

        return "wechat/webpay/webpay_entry";

    }

    /**
     * 发起公众号支付
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/wechatWebPay")
    public String wechatWebPay(HttpServletRequest request) throws Exception {
        // 返回值定义
        String key = request.getParameter("key");
        String service_type = request.getParameter("service_type");
        String appid = request.getParameter("appid");
        String mch_id = request.getParameter("mch_id");
        String out_trade_no = request.getParameter("out_trade_no");
        String device_info = request.getParameter("device_info");
        String body = request.getParameter("body");
        String detail = request.getParameter("detail");
        String attach = request.getParameter("attach");
        String fee_type = request.getParameter("fee_type");
        String total_fee = request.getParameter("total_fee");
        String spbill_create_ip = request.getParameter("spbill_create_ip");
        String notify_url = request.getParameter("notify_url");
        String time_start = request.getParameter("time_start");
        String time_expire = request.getParameter("time_expire");
        String op_user_id = mch_id;
        String goods_tag = request.getParameter("goods_tag");
        String product_id = request.getParameter("product_id");
        String limit_pay = request.getParameter("limit_pay");
        String nonce_str = request.getParameter("nonce_str");
        String openid = request.getParameter("openid");
        String callback_url = request.getParameter("callback_url");
        WechatWebPayRequest webPayRequest = new WechatWebPayRequest(key, service_type, appid, mch_id,
                out_trade_no, device_info, body, detail, attach, fee_type, total_fee, spbill_create_ip,
                notify_url, time_start, time_expire, op_user_id, goods_tag, product_id, limit_pay,
                nonce_str, openid, callback_url, log);

        log.info("IndexTestController-公众号支付测试请求数据为: {}", webPayRequest);

        String brcb_gateway_url = Constant.BRCB_GATEWAY_URL;
        request.setAttribute("brcb_gateway_url", brcb_gateway_url);
        request.setAttribute("result", webPayRequest);
        return "wechat/webpay/webpay_pay";
    }


    /**
     * 订单查询参数
     *
     * @param request
     * @return
     */
    @RequestMapping("/orderquery_param")
    public String orderqueryParam(HttpServletRequest request) {
        String key = Constant.BRCB_KEY;
        String service_type = Constant.BRCB_SERVICE_TYPE_ORDERQUERY;
        String appid = "";
        String mch_id = Constant.BRCB_MCH_ID;
        String transaction_id = "";
        String out_trade_no = "";
        String nonce_str = RandomUtil.randomUUID();
        WechatOrderQueryRequest orderQueryRequest = new WechatOrderQueryRequest(key, service_type, appid, mch_id, transaction_id, out_trade_no, nonce_str, log);

        request.setAttribute("key", key);
        request.setAttribute("orderquery", orderQueryRequest);
        log.info("===> scannedResponse: {}", orderQueryRequest);
        return "wechat/orderquery/orderquery_param";
    }

    @RequestMapping("/wechatOrderQuery")
    public String orderQuery(HttpServletRequest request) throws Exception {
        // 返回值定义
        String key = request.getParameter("key");
        String service_type = request.getParameter("service_type");
        String appid = request.getParameter("appid");
        String mch_id = request.getParameter("mch_id");
        String transaction_id = request.getParameter("transaction_id");
        String out_trade_no = request.getParameter("out_trade_no");
        String nonce_str = request.getParameter("nonce_str");

        WechatOrderQueryRequest orderQueryRequest = new WechatOrderQueryRequest(key, service_type,
                appid, mch_id, transaction_id, out_trade_no, nonce_str, log);
        // 请求
        WechatOrderQueryResponse orderQueryResponse = wechatService.doOrderQuery(orderQueryRequest, log);

        // 放值
        request.setAttribute("orderQuery", orderQueryResponse);

        return "wechat/orderquery/orderquery_result";
    }


}
