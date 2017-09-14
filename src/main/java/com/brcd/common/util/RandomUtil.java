package com.brcd.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * 随机数工具类
 */
public class RandomUtil {

	/**
	 * 获得随机UUID32位字符串
	 * 
	 * @return 32位随机字符串
	 */
	public static String randomUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	/**
	 * 生成yyyyMMdd订单号
	 * 
	 * @param prefix
	 *            前缀
	 * @return yyyyMMdd带前缀的字符串
	 */
	public static String getOrderNum(String prefix) {
		Random random = new Random();
		String merOrderId = prefix + DateUtil.getFormatTime("yyyyMMddHHmmssSSS")
				+ (random.nextInt((int) Math.pow(10, 4)) + (int) Math.pow(10, 5));
		return merOrderId;
	}

	/**
	 * 生成当前毫秒值的带前缀号码
	 * 
	 * @param prefix
	 *            前缀
	 * @return 当前毫秒值的带前缀字符串
	 */
	public static String getTimeMillisNum(String prefix) {
		Random random = new Random();
		String merOrderId = prefix + String.valueOf(System.currentTimeMillis())
				+ (random.nextInt((int) Math.pow(10, 3)) + (int) Math.pow(10, 4));
		return merOrderId;
	}

	/**
	 * 获取一定长度的随机字符串
	 * 
	 * @param length
	 *            指定字符串长度
	 * @return 一定长度的字符串
	 */
	public static String getRandomStringByLength(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
}
