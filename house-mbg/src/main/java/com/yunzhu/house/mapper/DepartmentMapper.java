package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Department;
import com.yunzhu.house.model.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper extends BaseMapper<Department> {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Department row);

    int insertSelective(Department row);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Department row, @Param("example") DepartmentExample example);

    int updateByExample(@Param("row") Department row, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department row);

    int updateByPrimaryKey(Department row);
}