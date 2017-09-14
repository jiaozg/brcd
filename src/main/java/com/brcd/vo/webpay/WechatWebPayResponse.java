package com.brcd.vo.webpay;


import com.brcd.vo.AbstractBase;

/**
 * 下游商户公众号支付返回信息
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年10月14日 下午4:06:15
 */
@SuppressWarnings("serial")
public class WechatWebPayResponse extends AbstractBase {

    /**
     * 返回码
     */
    private String return_code;
    /**
     * 返回信息
     */
    private String return_msg;

    // 协议返回的具体数据（以下字段在return_code 为SUCCESS 的时候有返回）
    /**
     * 公众号ID
     */
    private String appid;
    /**
     * 商户号
     */
    private String mch_id;
    /**
     * 设备号
     */
    private String device_info;
    /**
     * 随机字符串
     */
    private String nonce_str;
    /**
     * 签名
     */
    private String sign;
    /**
     * 业务结果
     */
    private String result_code;
    /**
     * 错误码
     */
    private String err_code;
    /**
     * 错误信息
     */
    private String err_code_des;

    // 业务返回的具体数据（以下字段在return_code 和result_code 都为SUCCESS 的时候有返回）
    /**
     * 交易类型
     */
    private String trade_type;
    /**
     * 预支付回话标识
     */
    private String prepay_id;
    /**
     * 支付URL,可将该参数值生成二维码展示出来进行扫码支付
     */
    private String code_url;
    /**
     * 订单编号
     */
    private String order_num;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }
}
