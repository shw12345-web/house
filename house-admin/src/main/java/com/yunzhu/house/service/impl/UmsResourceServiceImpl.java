package com.yunzhu.house.service.impl;

import com.yunzhu.house.model.UmsResource;
import com.yunzhu.house.service.UmsResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台资源管理Service实现类
 *
 * @author DELL
 * @date 2022/8/4 17:22
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Override
    public int create(UmsResource umsResource) {
        return 0;
    }

    @Override
    public int update(Long id, UmsResource umsResource) {
        return 0;
    }

    @Override
    public UmsResource getItem(Long id) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<UmsResource> listAll() {
        return null;
    }
}
