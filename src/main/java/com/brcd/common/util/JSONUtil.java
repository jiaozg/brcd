package com.brcd.common.util;

import com.alibaba.fastjson.JSON;

/**
 * JSON工具类
 */
public class JSONUtil {

	/**
	 * Object对象转换为json
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJSONString(Object obj) {
		return JSON.toJSONString(obj);
	}

	/**
	 * json字符串转换为javabean
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static final <T> T parseObject(String json, Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}
}
