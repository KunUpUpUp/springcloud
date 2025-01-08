package com.seasugar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PayMentStarter {
    public static void main(String[] args) {
        SpringApplication.run(PayMentStarter.class, args);
    }
}