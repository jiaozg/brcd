package com.brcd.vo.orderquery;

import com.brcd.common.util.SignatureUtil;
import com.brcd.common.util.StringUtil;
import com.brcd.vo.base.WechatRequestBase;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 下游订单查询上送信息
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年10月14日 下午4:06:15
 */
@SuppressWarnings("serial")
public class WechatOrderQueryRequest extends WechatRequestBase {

    /**
     * 服务类型
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
     * 微信订单号
     */
    private String transaction_id;
    /**
     * 商户订单号
     */
    private String out_trade_no;
    /**
     * 随机字符串
     */
    private String nonce_str;
    /**
     * 签名
     */
    private String sign;

    public WechatOrderQueryRequest() {
        super();
    }

    public WechatOrderQueryRequest(String key, String service_type, String appid, String mch_id, String transaction_id,
                                   String out_trade_no, String nonce_str, Logger log) {
        setService_type(service_type);
        setAppid(appid);
        setMch_id(mch_id);
        setTransaction_id(transaction_id);
        setOut_trade_no(out_trade_no);
        setNonce_str(nonce_str);
        String sign = SignatureUtil.getSign(toMap(), key, log);
        setSign(sign);
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
                if (obj != null && StringUtil.isNotBlank((String) obj)) {
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
