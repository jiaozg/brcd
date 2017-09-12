package com.brcd.vo.orderquery;


import com.brcd.vo.base.WechatResponseBase;

/**
 * 下游订单查询返回信息
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年10月14日 下午4:06:15
 */
@SuppressWarnings("serial")
public class WechatOrderQueryResponse extends WechatResponseBase {

    /**
     * 返回状态码
     */
    private String return_code;// SUCCESS/FAIL此字段是通信标识，非交易标识，交易是否成功需要查看trade_state来判断
    /**
     * 返回信息
     */
    private String return_msg;// 返回信息，如非空，为错误原因

    // 以下字段在return_code为SUCCESS的时候有返回
    /**
     * 公众账号ID
     */
    private String appid;// 微信分配的公众账号ID
    /**
     * 商户号
     */
    private String mch_id;// 微信支付分配的商户号
    /**
     * 子商户公众账号ID
     */
    private String sub_appid;// 微信分配的子商户公众账号ID
    /**
     * 子商户号
     */
    private String sub_mch_id;// 微信支付分配的子商户号
    /**
     * 随机字符串
     */
    private String nonce_str;// 随机字符串，不长于32位。推荐随机数生成算法
    /**
     * 签名
     */
    private String sign;// 签名，详见签名生成算法
    /**
     * 业务结果
     */
    private String result_code;// SUCCESS/FAIL
    /**
     * 错误代码
     */
    private String err_code;// SYSTEMERROR 详细参见第6节错误列表
    /**
     * 错误代码描述
     */
    private String err_code_des;// 系统错误 结果信息描述

    // 以下字段在return_code 和result_code都为SUCCESS的时候有返回
    /**
     * 设备号
     */
    private String device_info;// 微信支付分配的终端设备号，
    /**
     * 用户标识
     */
    private String openid;// 用户在商户appid下的唯一标识
    /**
     * 是否关注公众账号
     */
    private String is_subscribe;// 用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
    /**
     * 用户子标识
     */
    private String sub_openid;// 用户在子商户appid下的唯一标识
    /**
     * 是否关注子公众账号
     */
    private String sub_is_subscribe;// 用户是否关注子公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
    /**
     * 交易类型
     */
    private String trade_type;// 调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，MICROPAY，详细说明见参数规定
    /**
     * 交易状态
     */
    private String trade_state;// SUCCESS—支付成功 REFUND—转入退款 NOTPAY—未支付 CLOSED—已关闭
    // REVOKED—已撤销(刷卡支付) USERPAYING--用户支付中
    // PAYERROR--支付失败(其他原因，如银行返回失败)
    /**
     * 付款银行
     */
    private String bank_type;// 银行类型，采用字符串类型的银行标识
    /**
     * 商品详情
     */
    private String detail;//
    /**
     * 总金额
     */
    private String total_fee;// 订单总金额，单位为分
    /**
     * 货币种类
     */
    private String fee_type;// 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
    /**
     * 现金支付金额
     */
    private String cash_fee;// 现金支付金额订单现金支付金额，详见支付金额
    /**
     * 现金支付货币类型
     */
    private String cash_fee_type;// 货币类型
    /**
     * 代金券或立减优惠金额
     */
    private String coupon_fee;// “代金券或立减优惠”金额<=订单总金额，订单总金额-“代金券或立减优惠”金额=现金支付金额，详见支付金额
    /**
     * 代金券或立减优惠使用数量
     */
    private String coupon_count;// 代金券或立减优惠使用数量
    /**
     * 微信支付订单号
     */
    private String transaction_id;// 微信支付订单号
    /**
     * 商户订单号
     */
    private String out_trade_no;// 商户系统的订单号，与请求一致。
    /**
     * 商家数据包
     */
    private String attach;// 商家数据包，原样返回
    /**
     * 支付完成时间
     */
    private String time_end;// 订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则
    /**
     * 交易状态描述
     */
    private String trade_state_desc;// 对当前查询订单状态的描述和下一步操作的指引

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

    public String getSub_appid() {
        return sub_appid;
    }

    public void setSub_appid(String sub_appid) {
        this.sub_appid = sub_appid;
    }

    public String getSub_mch_id() {
        return sub_mch_id;
    }

    public void setSub_mch_id(String sub_mch_id) {
        this.sub_mch_id = sub_mch_id;
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

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getSub_openid() {
        return sub_openid;
    }

    public void setSub_openid(String sub_openid) {
        this.sub_openid = sub_openid;
    }

    public String getSub_is_subscribe() {
        return sub_is_subscribe;
    }

    public void setSub_is_subscribe(String sub_is_subscribe) {
        this.sub_is_subscribe = sub_is_subscribe;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(String cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    public String getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(String coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    public String getCoupon_count() {
        return coupon_count;
    }

    public void setCoupon_count(String coupon_count) {
        this.coupon_count = coupon_count;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getTrade_state_desc() {
        return trade_state_desc;
    }

    public void setTrade_state_desc(String trade_state_desc) {
        this.trade_state_desc = trade_state_desc;
    }

}
