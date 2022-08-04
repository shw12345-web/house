package com.yunzhu.house.service.impl;

import com.yunzhu.house.model.UmsAdmin;
import com.yunzhu.house.model.UmsResource;
import com.yunzhu.house.service.UmsAdminCacheService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户缓存操作Service实现类
 *
 * @author DELL
 * @date 2022/8/4 17:20
 */
@Service
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {
    @Override
    public void delAdmin(Long adminId) {

    }

    @Override
    public void delResourceList(Long adminId) {

    }

    @Override
    public void delResourceListByRole(Long roleId) {

    }

    @Override
    public void delResourceListByRoleIds(List<Long> roleIds) {

    }

    @Override
    public void delResourceListByResource(Long resourceId) {

    }

    @Override
    public UmsAdmin getAdmin(String username) {
        return null;
    }

    @Override
    public void setAdmin(UmsAdmin admin) {

    }

    @Override
    public List<UmsResource> getResourceList(Long adminId) {
        return null;
    }

    @Override
    public void setResourceList(Long adminId, List<UmsResource> resourceList) {

    }
}
