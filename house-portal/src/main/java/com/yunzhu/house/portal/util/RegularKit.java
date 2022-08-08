package com.yunzhu.house.portal.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则工具类
 *
 * @author DELL
 * @date 2022/8/8 9:35
 */
public class RegularKit {

    /**
     * 校验是否是正确的手机号码
     *
     * @param mobile
     * @return
     */
    public static boolean isMobile(String mobile) {
        Pattern p = Pattern.compile("^1[0-9]{10}$");
        Matcher m = p.matcher(mobile);
        if (m.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 校验是否是正确的邮箱
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 校验是否是数字
     *
     * @param number
     * @return
     */
    public static boolean isNumber(String number) {

        Pattern p = Pattern.compile("^[0-9]*$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            return true;
        }
        return false;

    }
}
