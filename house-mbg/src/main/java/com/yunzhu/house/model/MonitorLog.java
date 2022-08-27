package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 监控日志表
 * @TableName monitor_log
 */
@TableName(value ="monitor_log")
@Data
public class MonitorLog implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 日志类型
     */
    private Integer logType;

    /**
     * 日志描述
     */
    private String message;

    /**
     * 对象ID
     */
    private Integer objectId;

    /**
     * 失联时间，单位为毫秒
     */
    private Double value;

    /**
     * 是否解除警报
     */
    private Integer disarm;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}