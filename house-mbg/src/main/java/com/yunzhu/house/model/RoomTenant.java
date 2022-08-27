package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName room_tenant
 */
@TableName(value ="room_tenant")
@Data
public class RoomTenant implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房间ID
     */
    private Long roomid;

    /**
     * 房间名称
     */
    private String roomname;

    /**
     * 租客ID
     */
    private Long tenantid;

    /**
     * 租客名
     */
    private String tenantname;

    /**
     * 描述信息
     */
    private String descinfo;

    /**
     * 起始时间
     */
    private Date startdate;

    /**
     * 结束时间
     */
    private Date enddate;

    /**
     * 
     */
    private String checkopion;

    /**
     * 审核者ID
     */
    private Long checkerid;

    /**
     * 审核者姓名
     */
    private String checkername;

    /**
     * 审核时间
     */
    private Date checkdate;

    /**
     * yes：已退租，no：没退租
     */
    private String ishistory;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}