package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Authority;
import com.yunzhu.house.model.AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityMapper extends BaseMapper<Authority> {
    long countByExample(AuthorityExample example);

    int deleteByExample(AuthorityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Authority row);

    int insertSelective(Authority row);

    List<Authority> selectByExample(AuthorityExample example);

    Authority selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Authority row, @Param("example") AuthorityExample example);

    int updateByExample(@Param("row") Authority row, @Param("example") AuthorityExample example);

    int updateByPrimaryKeySelective(Authority row);

    int updateByPrimaryKey(Authority row);
}