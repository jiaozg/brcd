/**   
* @Title: AliPayScannedRequest.java 
* @Package com.brcb.vo.scan 
* @Description:支付宝扫码请求参数
* @author 朱梦光
* @date 2017年9月12日 上午11:16:35 
* @version V1.0   
*/
package com.brcd.vo.scan;

import com.brcd.common.util.SignatureUtil;
import com.brcd.common.util.StringUtil;
import com.brcd.vo.base.AliPayScannedRequestBase;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class AliPayScannedRequest extends AliPayScannedRequestBase {

	// 每个字段具体的意思请查看API文档
	/**
	 * 业务类型
	 */
	private String service_type;

	/**
	 * 商户号
	 */
	private String mch_id;
	/**
	 * 商户订单号，需要保证不重复
	 */
	private String out_trade_no;
	
	/**
	 * 总金额
	 * private String total_fee;
	 */
	private String total_amount;
	/*
	 * 订单标题
	 */
	private String subject = "";
	/**
	 * 商品描述
	 */
	private String body;
	/**
	 * 交易起始时间
	 */
	private String time_start;
	/**
	 * 交易失效时间
	 * private String time_expire;
	 */
	private String timeout_express;
	/**
	 * 操作员
	 */
	private String op_user_id;
	/*
	 * 商户门店编号
	 */
	private String store_id;

	/**
	 * 设备号
	 */
	private String device_info;
	/**
	 * 通知地址
	 */
	private String notify_url;
	/**
	 * 随机字符串
	 */
	private String nonce_str;
	/**
	 * 指定支付方式
	 */
	private String limit_pay;

	private String sign;

	public AliPayScannedRequest() {
		super();

	}

	public AliPayScannedRequest(String key, String service_type, String mch_id, String out_trade_no, String total_fee,
			String subject, String body,
			String time_start, String time_expire, String op_user_id, String store_id, String device_info,
			String notify_url, String nonce_str, String limit_pay, Logger log) {
		setService_type(service_type);
		setMch_id(mch_id);
		setOut_trade_no(out_trade_no);
		setTotal_amount(total_fee);
		setSubject(subject);
		setBody(body);
		setTime_start(time_start);
		setTimeout_express(time_expire);
		setOp_user_id(op_user_id);
		setStore_id(store_id);
		setDevice_info(device_info);
		setNotify_url(notify_url);
		setNonce_str(nonce_str);
		setLimit_pay(limit_pay);
		// 根据API给的签名规则进行签名
		String sign = SignatureUtil.getSign(toMap(), key, log);
		System.out.println("============================" + sign);
		setSign(sign);// 把签名数据设置到Sign这个属性中
	}


	@Override
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

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	public String getTimeout_express() {
		return timeout_express;
	}

	public void setTimeout_express(String timeout_express) {
		this.timeout_express = timeout_express;
	}

	public String getOp_user_id() {
		return op_user_id;
	}

	public void setOp_user_id(String op_user_id) {
		this.op_user_id = op_user_id;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getLimit_pay() {
		return limit_pay;
	}

	public void setLimit_pay(String limit_pay) {
		this.limit_pay = limit_pay;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}
