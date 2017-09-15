/**   
* @Title: AliPayScannedResponseBase.java 
* @Package com.brcb.vo.base 
* @Description: TODO
* @author 朱梦光
* @date 2017年9月12日 下午2:14:59 
* @version V1.0   
*/
package com.brcd.vo.base;


import com.brcd.vo.AbstractBase;

public abstract class AliPayScannedResponseBase extends AbstractBase {

	private String return_code;

	private String return_msg;

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

}
