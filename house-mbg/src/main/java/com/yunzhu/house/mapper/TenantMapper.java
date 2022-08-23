package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Tenant;
import com.yunzhu.house.model.TenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenantMapper  extends BaseMapper<Tenant> {
    long countByExample(TenantExample example);

    int deleteByExample(TenantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tenant row);

    int insertSelective(Tenant row);

    List<Tenant> selectByExample(TenantExample example);

    Tenant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Tenant row, @Param("example") TenantExample example);

    int updateByExample(@Param("row") Tenant row, @Param("example") TenantExample example);

    int updateByPrimaryKeySelective(Tenant row);

    int updateByPrimaryKey(Tenant row);
}