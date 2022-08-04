package com.yunzhu.house.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by shw on 2022/8/4.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.yunzhu.house.mapper","com.yunzhu.house.portal.dao"})
public class MyBatisConfig {
}
