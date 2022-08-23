package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Housetype;
import com.yunzhu.house.model.HousetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousetypeMapper extends BaseMapper<Housetype> {
    long countByExample(HousetypeExample example);

    int deleteByExample(HousetypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Housetype row);

    int insertSelective(Housetype row);

    List<Housetype> selectByExample(HousetypeExample example);

    Housetype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Housetype row, @Param("example") HousetypeExample example);

    int updateByExample(@Param("row") Housetype row, @Param("example") HousetypeExample example);

    int updateByPrimaryKeySelective(Housetype row);

    int updateByPrimaryKey(Housetype row);
}