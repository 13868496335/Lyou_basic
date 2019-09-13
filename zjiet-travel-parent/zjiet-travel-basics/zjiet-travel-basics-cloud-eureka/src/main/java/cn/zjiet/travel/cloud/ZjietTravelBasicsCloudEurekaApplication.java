package cn.zjiet.travel.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@Description: 携程旅行✈️ 基础cloud配置类
 *@Author: Linc
 *@date: 2019-09-07
 */
@EnableEurekaServer
@SpringBootApplication
public class ZjietTravelBasicsCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjietTravelBasicsCloudEurekaApplication.class, args);
    }

}
