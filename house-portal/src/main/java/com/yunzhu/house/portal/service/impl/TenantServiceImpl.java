package com.yunzhu.house.portal.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yunzhu.house.mapper.TenantMapper;
import com.yunzhu.house.model.Tenant;
import com.yunzhu.house.portal.service.TenantService;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【tenant(租客)】的数据库操作Service实现
* @createDate 2022-08-27 11:40:53
*/
@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant>
    implements TenantService {

}




