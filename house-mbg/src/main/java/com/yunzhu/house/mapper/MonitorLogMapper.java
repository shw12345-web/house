package com.yunzhu.house.mapper;

import com.yunzhu.house.model.MonitorLog;
import com.yunzhu.house.model.MonitorLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorLogMapper {
    long countByExample(MonitorLogExample example);

    int deleteByExample(MonitorLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MonitorLog row);

    int insertSelective(MonitorLog row);

    List<MonitorLog> selectByExample(MonitorLogExample example);

    MonitorLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") MonitorLog row, @Param("example") MonitorLogExample example);

    int updateByExample(@Param("row") MonitorLog row, @Param("example") MonitorLogExample example);

    int updateByPrimaryKeySelective(MonitorLog row);

    int updateByPrimaryKey(MonitorLog row);
}