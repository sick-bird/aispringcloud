package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 开启eureka注册中心服务端
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

