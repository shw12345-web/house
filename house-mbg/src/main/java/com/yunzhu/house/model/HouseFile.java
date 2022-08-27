package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName house_file
 */
@TableName(value ="house_file")
@Data
public class HouseFile implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房屋资源ID
     */
    private Long houseid;

    /**
     * 图片类型
     */
    private String picturetype;

    /**
     * 图片名称
     */
    private String filename;

    /**
     * 图片地址
     */
    private String fileurl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}