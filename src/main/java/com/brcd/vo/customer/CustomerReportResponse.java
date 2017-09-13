package com.brcd.vo.customer;



import com.brcd.common.util.StringUtil;
import com.brcd.vo.base.WechatResponseBase;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 北农商商户进件
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年10月28日 下午3:41:04
 */
public class CustomerReportResponse extends WechatResponseBase {

    String return_code;
    String return_msg;
    String sign;
    String customer_num;
    String api_key;

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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCustomer_num() {
        return customer_num;
    }

    public void setCustomer_num(String customer_num) {
        this.customer_num = customer_num;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
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
