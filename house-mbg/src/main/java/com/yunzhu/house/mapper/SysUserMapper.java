package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.model.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper extends BaseMapper<SysUser> {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser row);

    int insertSelective(SysUser row);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SysUser row, @Param("example") SysUserExample example);

    int updateByExample(@Param("row") SysUser row, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser row);

    int updateByPrimaryKey(SysUser row);
}