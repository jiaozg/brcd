package com.brcd.vo.micro;


import com.brcd.common.util.SignatureUtil;
import com.brcd.common.util.StringUtil;
import com.brcd.vo.base.WechatRequestBase;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 刷卡(小额)请求数据
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/2 11:34
 */
public class WechatMicroRequest extends WechatRequestBase {

    /**
     * 服务类型
     */
    private String service_type;
    /**
     * 公众账号ID
     */
    private String appid;
    /**
     * 商户编号
     */
    private String mch_id;
    /**
     * 随机字符串
     */
    private String nonce_str;
    /**
     * 商户订单号
     */
    private String out_trade_no;
    /**
     * 授权码
     */
    private String auth_code;
    /**
     * 商品描述
     */
    private String body;
    /**
     * 订单金额
     */
    private String total_fee;
    /**
     * 附加数据
     */
    private String attach;
    /**
     * 商品详情
     */
    private String detail;
    /**
     * 设备号
     */
    private String device_info;
    /**
     * 货币类型
     */
    private String fee_type;
    /**
     * 商品标记
     */
    private String goods_tag;
    /**
     * 产品id
     */
    private String product_id;
    /**
     * 终端IP
     */
    private String spbill_create_ip;
    /**
     * 操作人
     */
    private String op_user_id;
    /**
     * 订单开始时间
     */
    private String time_expire;
    /**
     * 订单失效时间
     */
    private String time_start;
    /**
     * 签名
     */
    private String sign;

    public WechatMicroRequest() {
        super();
    }

    public WechatMicroRequest(String key, String service_type, String appid, String mch_id, String nonce_str,
                              String out_trade_no, String auth_code, String body, String total_fee, String attach, String detail,
                              String device_info, String fee_type, String goods_tag, String product_id, String spbill_create_ip,
                              String op_user_id, String time_expire, String time_start, Logger log) {
        setService_type(service_type);
        setAppid(appid);
        setMch_id(mch_id);
        setNonce_str(nonce_str);
        setOut_trade_no(out_trade_no);
        setAuth_code(auth_code);
        setBody(body);
        setTotal_fee(total_fee);
        setAttach(attach);
        setDetail(detail);
        setDevice_info(device_info);
        setFee_type(fee_type);
        setGoods_tag(goods_tag);
        setSpbill_create_ip(spbill_create_ip);
        setOp_user_id(op_user_id);
        setProduct_id(product_id);
        setTime_expire(time_expire);
        setTime_start(time_start);
        String sign = SignatureUtil.getSign(toMap(), key, log);
        setSign(sign);// 把签名数据设置到Sign这个属性中
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
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

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }


    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getOp_user_id() {
        return op_user_id;
    }

    public void setOp_user_id(String op_user_id) {
        this.op_user_id = op_user_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
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
