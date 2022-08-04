package com.yunzhu.house.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 *
 * @author DELL
 * @date 2022/8/4 16:17
 */

@Configuration
@EnableTransactionManagement
@MapperScan({"com.yunzhu.house.mapper","com.yunzhu.house.dao"})
public class MyBatisConfig {
}
