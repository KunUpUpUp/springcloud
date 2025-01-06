package com.seasugar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("pay")
@RestController
@RefreshScope
public class PaymentController {
    @Value("${db.username}")
    private String username;

    @GetMapping
    public void payByWeixin() {
        System.out.println(username);
    }
}
