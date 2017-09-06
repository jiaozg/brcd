package com.brcd.common.util;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @action UUID工具类
 * @user 白雪杰
 * @date 2017年6月26日
 */
public class Uid {
	/**
	 * 生成UUID
	 * @return
	 */
	public static String getUuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 生成随机字符串
	 * @param CodeCount
	 * @param allChar
	 * @return
	 */
	public static String getUuid(int CodeCount,String allChar){
		//String allChar = "1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,i,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
		String[] allCharArray = allChar.split(",");
		String RandomCode = "";
		int temp = -1;
		Random rand = new Random();
          //int CodeCount=20;
		for (int i = 0; i < CodeCount; i++)
		{
			if (temp != -1)
			{
				rand = new Random(temp * i * ((int) new Date().getTime()));
			} int t = rand.nextInt(allCharArray.length - 1);
			while (temp == t)

			{
				t = rand.nextInt(allCharArray.length - 1);
			} temp = t;
			RandomCode += allCharArray[t];
		}
		System.out.println(RandomCode);
		return RandomCode;
	}
}
