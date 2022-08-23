package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class HouseownerHouse implements Serializable {
    private Long id;

    private Long houseid;

    private Long houseownerid;

    private static final long serialVersionUID = 1L;

}