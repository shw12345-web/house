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
 * @TableName room
 */
@TableName(value ="room")
@Data
public class Room implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房间名称
     */
    private String roomname;

    /**
     * 房间面积
     */
    private String roomarea;

    /**
     * 房间描述
     */
    private String roomdesc;

    /**
     * 房间二维码照片
     */
    private String roomtwodimensionalcode;

    /**
     * 房间照片
     */
    private String roomimage;

    /**
     * 房屋ID
     */
    private Long houseid;

    /**
     * 房屋名
     */
    private String housename;

    /**
     * 审核内容
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
     * 
     */
    private Date registdate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}