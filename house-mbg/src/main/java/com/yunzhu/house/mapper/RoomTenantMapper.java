package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.RoomTenant;
import com.yunzhu.house.model.RoomTenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomTenantMapper extends BaseMapper<RoomTenant> {
    long countByExample(RoomTenantExample example);

    int deleteByExample(RoomTenantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoomTenant row);

    int insertSelective(RoomTenant row);

    List<RoomTenant> selectByExample(RoomTenantExample example);

    RoomTenant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") RoomTenant row, @Param("example") RoomTenantExample example);

    int updateByExample(@Param("row") RoomTenant row, @Param("example") RoomTenantExample example);

    int updateByPrimaryKeySelective(RoomTenant row);

    int updateByPrimaryKey(RoomTenant row);
}