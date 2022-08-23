package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.RoleAuthority;
import com.yunzhu.house.model.RoleAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorityMapper extends BaseMapper<RoleAuthority> {
    long countByExample(RoleAuthorityExample example);

    int deleteByExample(RoleAuthorityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleAuthority row);

    int insertSelective(RoleAuthority row);

    List<RoleAuthority> selectByExample(RoleAuthorityExample example);

    RoleAuthority selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") RoleAuthority row, @Param("example") RoleAuthorityExample example);

    int updateByExample(@Param("row") RoleAuthority row, @Param("example") RoleAuthorityExample example);

    int updateByPrimaryKeySelective(RoleAuthority row);

    int updateByPrimaryKey(RoleAuthority row);
}