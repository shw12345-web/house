package com.yunzhu.house.common.exception;

import com.yunzhu.house.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @author DELL
 * @date 2022/8/4 15:07
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
