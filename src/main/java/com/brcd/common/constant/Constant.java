package com.brcd.common.constant;


import com.brcd.common.util.PropertiesUtil;

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
    /**
     * 加密key
     */
    public static String BRCB_KEY = PropertiesUtil.getString("brcb.key");
    /**
     * 商户号
     */
    public static String BRCB_MCH_ID = PropertiesUtil.getString("brcb.mch_id");
    /**
     * 请求网关
     */
    public static String BRCB_GATEWAY_URL = PropertiesUtil.getString("brcb.gateway.url");
    /**
     * 进件
     */
    public static String BRCB_CUSTOMER_REPORT_URL = PropertiesUtil.getString("brcb.customer.report.url");
    /**
     * 后台回调地址
     */
    public static String BRCB_NOTIFY_URL = PropertiesUtil.getString("brcb.notify.url");
    /**
     * 前端结果地址
     */
    public static String BRCB_CALLBACK_URL = PropertiesUtil.getString("brcb.callback.url");
    /**
     * 域名
     */
    public static String DOMAIN_NAME = PropertiesUtil.getString("domain.name");
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

    //支付宝

    /**
     * 支付宝网关
     */
    public static String ALIPAY_URL = PropertiesUtil.getString("brcd.alipay.url");
     /**
     支付宝APP_ID
     */
     public static String ALIPAY_APP_ID = PropertiesUtil.getString("brcd.alipay.app_id");
    /**
     应用私钥
     */
    public static String ALIPAY_APP_PRIVATE_KEY = PropertiesUtil.getString("brcd.alipay.app_private_key");
    /**
     参数返回格式，只支持json
     */
    public static String ALIPAY_FORMAT = PropertiesUtil.getString("brcd.alipay.format");
    /**
     请求和签名使用的字符编码格式，支持GBK和UTF-8
     */
    public static String ALIPAY_CHARSET = PropertiesUtil.getString("brcd.alipay.charset");
    /**
     支付宝公钥，由支付宝生成
     */
    public static String ALIPAY_PUBLIC_KEY = PropertiesUtil.getString("brcd.alipay.alipay_public_key");
    /**
     商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     */
    public static String ALIPAY_SIGN_TYPE = PropertiesUtil.getString("brcd.alipay.sign_type");
}
