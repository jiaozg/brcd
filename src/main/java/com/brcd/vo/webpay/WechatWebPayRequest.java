package com.brcd.vo.webpay;


import com.brcd.common.util.SignatureUtil;
import com.brcd.vo.AbstractBase;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 下游商户公众号支付上送信息
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年10月14日 下午4:06:15
 */
@SuppressWarnings("serial")
public class WechatWebPayRequest extends AbstractBase {

    /**
     * 接口类型
     */
    private String service_type;
    /**
     * 公众号
     */
    private String appid;
    /**
     * 商户号
     */
    private String mch_id;
    /**
     * 商户平台订单号
     */
    private String out_trade_no;
    /**
     * 设备号
     */
    private String device_info;
    /**
     * 商品描述
     */
    private String body;
    /**
     * 商品详情
     */
    private String detail;
    /**
     * 附加数据
     */
    private String attach;
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
     * 通知地址
     */
    private String notify_url;
    /**
     * 订单生成时间
     */
    private String time_start;
    /**
     * 订单超时时间
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
     * 商品ID
     */
    private String product_id;
    /**
     * 指定支付方式
     */
    private String limit_pay;
    /**
     * 随机字符串
     */
    private String nonce_str;
    /**
     * openid
     */
    private String openid;
    /**
     * 签名
     */
    private String sign;
    /**
     * 支付完成跳转页面
     */
    private String callback_url;

    public WechatWebPayRequest() {
        super();
    }

    public WechatWebPayRequest(String key, String service_type, String appid, String mch_id,
                               String out_trade_no, String device_info, String body, String detail, String attach,
                               String fee_type, String total_fee, String spbill_create_ip, String notify_url,
                               String time_start, String time_expire, String op_user_id, String goods_tag,
                               String product_id, String limit_pay, String nonce_str, String openid, String callback_url, Logger log) {
        setService_type(service_type);
        setAppid(appid);
        setMch_id(mch_id);
        setOut_trade_no(out_trade_no);
        setDevice_info(device_info);
        setBody(body);
        setDetail(detail);
        setAttach(attach);
        setFee_type(fee_type);
        setTotal_fee(total_fee);
        setSpbill_create_ip(spbill_create_ip);
        setNotify_url(notify_url);
        setTime_start(time_start);
        setTime_expire(time_expire);
        setOp_user_id(op_user_id);
        setGoods_tag(goods_tag);
        setProduct_id(product_id);
        setLimit_pay(limit_pay);
        setNonce_str(nonce_str);
        setOpenid(openid);
        setCallback_url(callback_url);
        String sign = SignatureUtil.getSign(toMap(), key, log);
        setSign(sign);// 把签名数据设置到Sign这个属性中
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
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

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
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

    public String getOp_user_id() {
        return op_user_id;
    }

    public void setOp_user_id(String op_user_id) {
        this.op_user_id = op_user_id;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
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

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    /**
     * 对象转化为Map
     *
     * @return
     * @author zhang.hui@pufubao.net
     * @date 2016年10月14日 下午6:19:18
     */
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if (obj != null) {
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
