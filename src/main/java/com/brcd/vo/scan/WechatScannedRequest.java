package com.brcd.vo.scan;


import com.brcd.common.util.SignatureUtil;
import com.brcd.common.util.StringUtil;
import com.brcd.vo.base.WechatRequestBase;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 扫码请求数据
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/1 15:45
 */
public class WechatScannedRequest extends WechatRequestBase {


    // 每个字段具体的意思请查看API文档
    /**
     * 业务类型
     */
    private String service_type;
    /**
     * 公众账号ID
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
     * 商品描述
     */
    private String body;
    /**
     * 详情
     */
    private String detail;
    /**
     * 附加数据
     */
    private String attach;
    /**
     * 商户订单号
     */
    private String out_trade_no;
    /**
     * 货币类型
     */
    private String fee_type;
    /**
     * 总金额
     */
    private String total_fee;
    /**
     * 终端IP
     */
    private String spbill_create_ip;
    /**
     * 交易起始时间
     */
    private String time_start;
    /**
     * 交易失效时间
     */
    private String time_expire;
    /**
     * 操作员
     */
    private String op_user_id;
    /**
     * 商品标记
     */
    private String goods_tag;
    /**
     * 通知地址
     */
    private String notify_url;
    /**
     * 商品ID
     */
    private String product_id;
    /**
     * 指定支付方式
     */
    private String limit_pay;

    public WechatScannedRequest() {
        super();
    }

    public WechatScannedRequest(String key, String service_type, String appid, String mch_id, String device_info,
                                String nonce_str, String body, String detail, String attach, String out_trade_no, String fee_type, String total_fee,
                                String spbill_create_ip, String time_start, String time_expire, String op_user_id, String goods_tag, String notify_url,
                                String product_id, String limit_pay, Logger log) {
        setService_type(service_type);
        // 微信分配的公众号ID（开通公众号之后可以获取到）
        setAppid(appid);
        // 微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
        setMch_id(mch_id);
        // 设备号
        setDevice_info(device_info);
        // 随机字符串，不长于32 位
        setNonce_str(nonce_str);
        // 要支付的商品的描述信息，用户会在支付成功页面里看到这个信息
        setBody(body);
        //详情
        setDetail(detail);
        // 支付订单里面可以填的附加数据，API会将提交的这个附加数据原样返回，有助于商户自己可以注明该笔消费的具体内容，方便后续的运营和记录
        setAttach(attach);
        // 商户系统内部的订单号,32个字符内、可包含字母
        setOut_trade_no(out_trade_no);
        // 货币类型, 符合ISO 4217标准的三位字母代码，默认人民币：CNY
        setFee_type(fee_type);
        // 订单总金额，单位为分
        setTotal_fee(total_fee);
        // 用户端ip
        setSpbill_create_ip(spbill_create_ip);
        // 交易起始时间
        setTime_start(time_start);
        // 交易结束时间
        setTime_expire(time_expire);
        setOp_user_id(op_user_id);
        // 商品标记，代金券或立减优惠功能的参数
        setGoods_tag(goods_tag);
        // 接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数
        setNotify_url(notify_url);
        // trade_type=NATIVE，此参数必传。此id为二维码中包含的商品ID，商户自行定义。
        setProduct_id(product_id);
        // 指定支付方式 no_credit--指定不能使用信用卡支付
        setLimit_pay(limit_pay);
        // 根据API给的签名规则进行签名
        String sign = SignatureUtil.getSign(toMap(), key, log);
        setSign(sign);// 把签名数据设置到Sign这个属性中
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOp_user_id() {
        return op_user_id;
    }

    public void setOp_user_id(String op_user_id) {
        this.op_user_id = op_user_id;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if (obj != null && StringUtil.isNotBlank(String.valueOf(obj))) {
                    map.put(field.getName(), obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }


}
