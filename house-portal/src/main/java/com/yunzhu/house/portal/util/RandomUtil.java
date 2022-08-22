package com.yunzhu.house.portal.util;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * 随机数工具
 *
 * @author DELL
 * @date 2022/8/8 9:41
 */
public class RandomUtil {

    private static final Random random = new Random();


    private static final DecimalFormat sixdf = new DecimalFormat("000000");

    public static String getSixBitRandom() {
        return sixdf.format(random.nextInt(1000000));
    }

    public static String getRandom() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            String str = "0123456789";
            char ch= str.charAt(new Random().nextInt(str.length()));
            builder.append(ch);
        }
        return builder.toString();
    }
    // 测试短信发送验证码
    public static void main(String[] args) {
        System.out.println(getRandom());
    }
}
