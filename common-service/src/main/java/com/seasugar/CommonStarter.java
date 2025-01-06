package com.seasugar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommonStarter {
    public static void main(String[] args) {
        SpringApplication.run(CommonStarter.class, args);
    }
}