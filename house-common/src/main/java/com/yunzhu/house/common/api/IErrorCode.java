package com.yunzhu.house.common.api;

/**
 * 常用API返回对象接口
 *
 * @author DELL
 * @date 2022/8/4 14:51
 */
public interface IErrorCode {

    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
