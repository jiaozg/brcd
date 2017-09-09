package com.brcd.common.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;

/**
 * 签名工具类
 *
 * @author zhang.hui@pufubao.net
 * @date 2016年10月20日 上午10:58:24
 * @version v1.0
 */
public class SignatureUtil {
	/**
	 * 签名算法
	 *
	 * @param o
	 *            要参与签名的数据对象
	 * @return 签名
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
//	public static String getSign(Object o, String key, Logger log)
//			throws IllegalArgumentException, IllegalAccessException {
//		ArrayList<String> list = new ArrayList<String>();
//		Class<? extends Object> cls = o.getClass();
//		Field[] fields = cls.getDeclaredFields();
//		for (Field f : fields) {
//			f.setAccessible(true);
//			if (f.get(o) != null && StringUtil.isNotBlank(String.valueOf(f.get(o)))) {
//				list.add(f.getName() + "=" + f.get(o) + "&");
//			}
//		}
//		int size = list.size();
//		String[] arrayToSort = list.toArray(new String[size]);
//		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < size; i++) {
//			sb.append(arrayToSort[i]);
//		}
//		String result = sb.toString();
//		result = result.substring(0, result.length() - 1);
//		result += key;
//		log.info("Sign Before MD5: {}", result);
//		result = MD5Util.MD5Encode(result).toUpperCase();
//		log.info("Sign Result: {}", result);
//		return result;
//	}

	/**
	 * 签名算法
	 *
	 * @param map
	 * @param key
	 * @param log
	 * @return
	 * @author zhang.hui@pufubao.net
	 * @date 2016年11月11日 下午2:53:33
	 */
	public static String getSign(Map<String, Object> map, String key, Logger log) {
		ArrayList<String> list = new ArrayList<String>();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			if (entry.getValue() != null && StringUtil.isNotBlank(String.valueOf(entry.getValue()))) {
				list.add(entry.getKey() + "=" + entry.getValue() + "&");
			}
		}
		int size = list.size();
		String[] arrayToSort = list.toArray(new String[size]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(arrayToSort[i]);
		}
		String result = sb.toString();
		result = result.substring(0, result.length() - 1);
		result += key;
		log.info("Sign Before MD5: {}", result);
		result = MD5Util.MD5Encode(result).toUpperCase();
		log.info("Sign Result: {}", result);
		return result;
	}

	/**
	 * 从API返回的JSON数据里面重新计算一次签名
	 *
	 * @param responseString
	 *            API返回的JSON数据
	 * @return 新鲜出炉的签名
	 */
	@SuppressWarnings("unchecked")
	public static String getSignFromResponseString(String responseString, String key, Logger log) {
		Map<String, Object> map = JSONUtil.parseObject(responseString, Map.class);
		// 清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
		map.put("sign", "");
		// 将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
		return SignatureUtil.getSign(map, key, log);
	}

	/**
	 * 检验API返回的数据里面的签名是否合法，避免数据在传输的过程中被第三方篡改
	 *
	 * @param responseString
	 *            API返回的JSON数据字符串
	 * @return API签名是否合法
	 */
	@SuppressWarnings("unchecked")
	public static boolean checkSign(String responseString, String key, Logger log) {

		Map<String, Object> map = JSONUtil.parseObject(responseString, HashMap.class);
		log.info("校验签名的数据:{}", map.toString());

		String signFromAPIResponse = map.get("sign").toString();
		if (signFromAPIResponse == "" || signFromAPIResponse == null) {
			log.info("API返回的数据签名数据不存在，有可能被第三方篡改!!!");
			return false;
		}
		log.info("服务器回包里面的签名是:{}", signFromAPIResponse);
		// 清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
		map.put("sign", "");
		// 将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
		String signForAPIResponse = SignatureUtil.getSign(map, key, log);

		if (!signForAPIResponse.equals(signFromAPIResponse)) {
			// 签名验不过，表示这个API返回的数据有可能已经被篡改了
			log.info("API返回的数据签名验证不通过，有可能被第三方篡改!!!");
			return false;
		}
		log.info("恭喜，API返回的数据签名验证通过!!!");
		return true;
	}

	/**
	 * 校验签名
	 *
	 * @param map
	 * @param key
	 * @param log
	 * @return
	 * @author zhang.hui@pufubao.net
	 * @date 2016年11月11日 下午5:21:21
	 */
	public static boolean checkSign(Map<String, Object> map, String key, Logger log) {
		log.info("校验签名的数据:{}", map.toString());

		String signFromAPIResponse = map.get("sign").toString();
		if (signFromAPIResponse == "" || signFromAPIResponse == null) {
			log.info("API返回的数据签名数据不存在，有可能被第三方篡改!!!");
			return false;
		}
		log.info("服务器回包里面的签名是:{}", signFromAPIResponse);
		// 清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
		map.remove("sign");
		// 将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
		String signForAPIResponse = SignatureUtil.getSign(map, key, log);

		if (!signForAPIResponse.equals(signFromAPIResponse)) {
			// 签名验不过，表示这个API返回的数据有可能已经被篡改了
			log.info("API返回的数据签名验证不通过，有可能被第三方篡改!!!");
			return false;
		}
		log.info("恭喜，API返回的数据签名验证通过!!!");
		return true;
	}

}
