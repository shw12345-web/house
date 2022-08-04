package com.yunzhu.house.config;

import com.yunzhu.house.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 *
 * @author DELL
 * @date 2022/8/4 16:05
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
