package com.brcd.common.util;

import java.util.Random;

/**账号随机生成
 * Created by 韩明泽 on 2017/9/11.
 */
public class AccountUtil {
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";//含有字符和数字的字符串
        Random random = new Random();//随机类<a href="https://www.baidu.com/s?wd=%E5%88%9D%E5%A7%8B%E5%8C%96&tn=44039180_cpr&fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1d9mhRvnWfsPW-BPHIBmHDY0ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EPjf4rjR3rjfY" target="_blank" class="baidu-highlight">初始化</a>
        StringBuffer sb = new StringBuffer();//StringBuffer类生成，为了拼接字符串

        for (int i = 0; i < length; ++i) {
            int number = random.nextInt(62);// [0,62)

            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
