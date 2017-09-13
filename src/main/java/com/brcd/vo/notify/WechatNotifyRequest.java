package com.brcd.vo.notify;



import com.brcd.common.util.SignatureUtil;
import com.brcd.vo.base.WechatRequestBase;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanghui on 20/04/2017.
 */

public class WechatNotifyRequest extends WechatRequestBase {


    /**
     * 返回状态码
     */
    private String return_code;// SUCCESS/FAIL;此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
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
     * 设备号
     */
    private String device_info;// 微信支付分配的终端设备号，
    /**
     * 随机字符串
     */
    private String nonce_str;// 随机字符串，不长于32位
    /**
     * 签名
     */
    private String sign;// 签名
    /**
     * 业务结果
     */
    private String result_code;// SUCCESS SUCCESS/FAIL
    /**
     * 订单状态
     */
    private String trade_state;// 订单状态
    /**
     * 错误代码
     */
    private String err_code;// SYSTEMERROR
    /**
     * 错误代码描述
     */
    private String err_code_des;// 系统错误 错误返回的信息描述
    /**
     * 用户标识
     */
    private String openid;// 用户在商户appid下的唯一标识
    /**
     * 是否关注公众账号
     */
    private String is_subscribe;// 用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
    /**
     * 交易类型
     */
    private String trade_type;// WECHAT_SCANNED,WECHAT_MICRO......
    /**
     * 付款银行
     */
    private String bank_type;// CMC 银行类型，采用字符串类型的银行标识，银行类型见附表
    /**
     * 总金额
     */
    private int total_fee = 0;// 订单总金额，单位为分
    /**
     * 货币种类
     */
    private String fee_type;// 货币类型，默认人民币：CNY
    /**
     * 平台订单号
     */
    private String transaction_id;// 平台订单号
    /**
     * 微信支付订单号
     */
    private String wechat_transaction_id; // 微信支付订单号
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
    private String time_end;// 支付完成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。

    public WechatNotifyRequest() {
        super();
    }

    public WechatNotifyRequest(String key, String return_code, String return_msg, String appid, String mch_id,
                               String device_info, String nonce_str, String result_code, String trade_state, String err_code,
                               String err_code_des, String openid, String is_subscribe, String trade_type, String bank_type, int total_fee,
                               String fee_type, String transaction_id, String wechat_transaction_id, String out_trade_no, String attach,
                               String time_end, Logger log) {
        setReturn_code(return_code);
        setReturn_msg(return_msg);
        setAppid(appid);
        setMch_id(mch_id);
        setDevice_info(device_info);
        setNonce_str(nonce_str);
        setResult_code(result_code);
        setTrade_state(trade_state);
        setErr_code(err_code);
        setErr_code_des(err_code_des);
        setOpenid(openid);
        setIs_subscribe(is_subscribe);
        setTrade_type(trade_type);
        setBank_type(bank_type);
        setTotal_fee(total_fee);
        setFee_type(fee_type);
        setTransaction_id(transaction_id);
        setWechat_transaction_id(wechat_transaction_id);
        setOut_trade_no(out_trade_no);
        setAttach(attach);
        setTime_end(time_end);
        String sign = SignatureUtil.getSign(toMap(), key, log);
        setSign(sign);
    }

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

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

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getWechat_transaction_id() {
        return wechat_transaction_id;
    }

    public void setWechat_transaction_id(String wechat_transaction_id) {
        this.wechat_transaction_id = wechat_transaction_id;
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
                if (obj != null && StringUtils.isNotBlank(String.valueOf(obj))) {
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
