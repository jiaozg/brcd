package com.brcd.common;

public class Constant {
    /**
     * 订单号前缀
     */
    public static String ORDER_PREFIX = "ORDER";
    /**
     * 编码格式
     */
    public static String UTF8 = "UTF-8";
    /**
     * MD5
     */
    public static String MD5 = "MD5";
    /**
     * SUCCESS
     */
    public static String SUCCESS = "SUCCESS";
    /**
     * FAIL
     */
    public static String FAIL = "FAIL";
//    /**
//     * 加密key
//     */
//    public static String BRCB_KEY = PropertiesUtil.getString("brcb.key");
//    /**
//     * 商户号
//     */
//    public static String BRCB_MCH_ID = PropertiesUtil.getString("brcb.mch_id");
//    /**
//     * 请求网关
//     */
//    public static String BRCB_GATEWAY_URL = PropertiesUtil.getString("brcb.gateway.url");
//    /**
//     * 进件
//     */
//    public static String BRCB_CUSTOMER_REPORT_URL = PropertiesUtil.getString("brcb.customer.report.url");
//    /**
//     * 后台回调地址
//     */
//    public static String BRCB_NOTIFY_URL = PropertiesUtil.getString("brcb.notify.url");
//    /**
//     * 前端结果地址
//     */
//    public static String BRCB_CALLBACK_URL = PropertiesUtil.getString("brcb.callback.url");
//    /**
//     * 域名
//     */
//    public static String DOMAIN_NAME = PropertiesUtil.getString("domain.name");
    /**
     * 请求类型
     */
    public static String BRCB_SERVICE_TYPE_SCANNED = "WECHAT_SCANNED";//订单查询
    public static String BRCB_SERVICE_TYPE_MICRO = "WECHAT_MICRO";//刷卡(小额)
    public static String BRCB_SERVICE_TYPE_WEBPAY = "WECHAT_WEBPAY";//公众号
    public static String BRCB_SERVICE_TYPE_ORDERQUERY = "WECHAT_ORDERQUERY";//订单查询
    /**
     * 订单类型
     */
    public static String BRCB_ORDER_TYPE_WECHAT = "WECHAT";//微信
    /**
     * 货币单位
     */
    public static String BRCB_FEE_TYPE = "CNY";//微信


}
