package com.brcd.vo.base;


import com.brcd.vo.AbstractBase;

/**
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/2 17:02
 */
public abstract class WechatResponseBase extends AbstractBase {
    /**
     * 响应码
     */
    private String return_code = "";
    /**
     * 响应信息
     */
    private String return_msg = "";

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
