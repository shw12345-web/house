package com.yunzhu.house.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 搜索启动入口
 *
 * @author DELL
 * @date 2022/8/4 17:06
 */
@SpringBootApplication(scanBasePackages = "com.yunzhu.house")
public class HouseSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseSearchApplication.class, args);
    }
}
