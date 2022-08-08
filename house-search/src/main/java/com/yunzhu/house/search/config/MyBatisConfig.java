package com.yunzhu.house.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by shw on 2022/8/4.
 */
@Configuration
@MapperScan({"com.yunzhu.house.mapper","com.yunzhu.house.search.dao"})
public class MyBatisConfig {
}
