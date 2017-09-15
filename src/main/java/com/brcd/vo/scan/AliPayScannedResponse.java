/**   
* @Title: AliPayScannedResponse.java 
* @Package com.brcb.vo.scan 
* @Description: TODO
* @author 朱梦光
* @date 2017年9月12日 下午2:29:54 
* @version V1.0   
*/
package com.brcd.vo.scan;


import com.brcd.vo.base.AliPayScannedResponseBase;

public class AliPayScannedResponse extends AliPayScannedResponseBase {

	// 返回状态码
	private String return_code;

	// 返回信息
	private String return_msg;
	// 业务结果
	private String result_code;
	// 商户号
	private String mch_id;

	// 设备号
	private String device_info;

	// 错误码
	private String err_code;
	// 错误码描述
	private String err_code_des;
	// 随机字符串
	private String nonce_str;
	// 二维码链接
	private String code_url;

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

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
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

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getCode_url() {
		return code_url;
	}

	public void setCode_url(String code_url) {
		this.code_url = code_url;
	}


}
