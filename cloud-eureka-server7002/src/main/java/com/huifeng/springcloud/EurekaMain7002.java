package com.huifeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther zzyy
 * @create 2020-02-18 21:15
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
    public static void main(String[] args) {
            SpringApplication.run(EurekaMain7002.class, args);
    }
}
