package cn.zjiet.travel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("cn.zjiet.travel.service.feign")
@SpringBootApplication
public class ZjietTravelServiceImpMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjietTravelServiceImpMemberApplication.class, args);
    }

}
