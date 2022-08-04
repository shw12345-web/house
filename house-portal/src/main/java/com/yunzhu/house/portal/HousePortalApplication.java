package com.yunzhu.house.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 前端启动入口
 *
 * @author DELL
 * @date 2022/8/4 16:49
 */
@SpringBootApplication(scanBasePackages = "com.yunzhu.house")
public class HousePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(HousePortalApplication.class, args);
    }
}
