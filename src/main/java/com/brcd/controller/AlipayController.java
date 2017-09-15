package com.brcd.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.brcd.bean.TbBusinessUser;
import com.brcd.common.constant.Constant;
import com.brcd.common.util.DateUtil;
import com.brcd.common.util.JSONUtil;
import com.brcd.common.util.RandomUtil;
import com.brcd.vo.scan.AliPayScannedRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by 朱梦光 on 2017/9/14.
 * 调用支付宝接口
 */
@Controller
public class AlipayController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 扫码参数
     * @throws AlipayApiException
     */
    @RequestMapping("/aliPayScanParam")
    public void aliPayScanParam() throws AlipayApiException {

    }

    /**
     * 扫码请求
     * @param
     * @return
     */
    @RequestMapping("/aliPayScan")
    public String aliPayScan(HttpServletRequest request, HttpSession session) throws Exception {
        //支付宝网关
        String URL = Constant.ALIPAY_URL;

        //支付宝APP_ID
        String APP_ID = Constant.ALIPAY_APP_ID;


        //应用私钥
        String APP_PRIVATE_KEY =Constant.ALIPAY_APP_PRIVATE_KEY;

        //参数返回格式，只支持json
       String FORMAT = Constant.ALIPAY_FORMAT;

        //请求和签名使用的字符编码格式，支持GBK和UTF-8
       String CHARSET = Constant.ALIPAY_CHARSET;

        //支付宝公钥，由支付宝生成
       String ALIPAY_PUBLIC_KEY = Constant.ALIPAY_PUBLIC_KEY;

        //商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
        String SIGN_TYPE = Constant.ALIPAY_SIGN_TYPE;

        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);


        Date now = new Date();
        String key = Constant.BRCB_KEY;
        /**
         * 接口类型
         */
        String service_type = "ALIPAY_SCANNED";
        /**
         * 商户号
         */
        String mch_id = Constant.BRCB_MCH_ID;
        /**
         * 商户订单号
         */
        String out_trade_no = RandomUtil.getOrderNum(Constant.ORDER_PREFIX);
        /**
         * 总金额
         */
        String total_fee = String.valueOf(1000);
        /**
         * 订单标题
         */
        TbBusinessUser businessUser = (TbBusinessUser) session.getAttribute("BusinessUser");
        String subject = businessUser.getBusinessUsername()+"收款";
        /**
         * 商品描述
         */
        String body = "Ipad_mini_16G_白色";

        /**
         * 订单生成时间
         */
        String time_start = DateUtil.format(now, DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        /**
         * 订单超时时间
         */
        //String time_expire = DateUtil.format(DateUtil.addMinutes(now, 10), DateUtil.DATE_STYLE_YYYYMMDDHHMMSS);
        String time_expire = "90m";
        /**
         * 操作员
         */
        String op_user_id = mch_id;
        /**
         * 商户门店编号
         */
        String store_id="NJ_001";
        /**
         * 设备号
         */
        String device_info = "SN1234567890098765";
        /**
         * 通知地址
         */
        String notify_url = "";
        /**
         * 随机字符串
         */
        String nonce_str = RandomUtil.randomUUID();
        /**
         * 指定支付方式
         */
        String limit_pay = "";
        /**
         * 签名
         */
        String sign  = "";
      AliPayScannedRequest scannedRequest = new AliPayScannedRequest( key,  service_type,  mch_id,  out_trade_no,  total_fee, subject,  body, time_start,  time_expire,  op_user_id,  store_id,  device_info, notify_url,  nonce_str,  limit_pay,  log);
        //
       AlipayTradePrecreateRequest request1 = new AlipayTradePrecreateRequest();// 创建API对应的request类
        //// 设置业务参数
        //request.setBizContent("{" +
        //        "\"out_trade_no\":\"20150320010101002\"," +
        //        "\"total_amount\":\"88.88\","+
        //        "\"subject\":\"Iphone6 16G\"," +
        //        "\"store_id\":\"NJ_001\"," +
        //        "\"timeout_express\":\"90m\"}"
        //);
        request1.setBizContent(JSONUtil.toJSONString(scannedRequest));
        //// 根据response中的结果继续业务逻辑处理
        AlipayTradePrecreateResponse response = alipayClient.execute(request1);

        System.out.println("response======::" + response.getBody());
         request.setAttribute("scan",response);
         //返回二维码路径
         request.setAttribute("qr_code",response.getQrCode());

       return "alipay/scan/scan_qrcode.html";
    }


}
