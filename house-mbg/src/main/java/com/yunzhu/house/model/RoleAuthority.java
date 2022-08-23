package com.yunzhu.house.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleAuthority implements Serializable {
    private Long id;

    private String authorityId;

    private Short role;

    private static final long serialVersionUID = 1L;

}