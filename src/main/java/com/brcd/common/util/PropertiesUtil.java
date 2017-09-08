package com.brcd.common.util;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 公共资源读取工具类
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/1 17:04
 */
public class PropertiesUtil {


    private final static Logger log = LoggerFactory.getLogger(PropertiesUtil.class);
    private static ResourceBundle rb;
    private final static String path = "brcb";

    static {
        try {
            rb = ResourceBundle.getBundle(path);
        } catch (MissingResourceException e) {
            log.error("未找到资源文件" + path + ".properties!", e);
        }
    }

    /**
     * 获取指定key值
     *
     * @param key
     * @return 字符串类型
     */
    public static String getString(String key) {
        try {
            return rb.getString(key);
        } catch (MissingResourceException e) {
            log.error(path + ".properties中未找到[" + key + "]属性！", e);
        }
        return "";
    }

    /**
     * 获取指定key值
     *
     * @param key
     * @return 布尔类型
     */
    public static boolean getBoolean(String key) {
        return BooleanUtils.toBoolean(getString(key));
    }

    /**
     * 获取指定key值
     *
     * @param key
     * @return 整型
     */
    public static int getInt(String key) {
        return NumberUtils.toInt(getString(key), 0);
    }


}
