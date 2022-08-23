package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.HouseDetail;
import com.yunzhu.house.model.HouseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseDetailMapper extends BaseMapper<HouseDetail> {
    long countByExample(HouseDetailExample example);

    int deleteByExample(HouseDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseDetail row);

    int insertSelective(HouseDetail row);

    List<HouseDetail> selectByExample(HouseDetailExample example);

    HouseDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseDetail row, @Param("example") HouseDetailExample example);

    int updateByExample(@Param("row") HouseDetail row, @Param("example") HouseDetailExample example);

    int updateByPrimaryKeySelective(HouseDetail row);

    int updateByPrimaryKey(HouseDetail row);
}