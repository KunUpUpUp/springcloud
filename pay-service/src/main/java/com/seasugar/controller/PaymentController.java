package com.seasugar.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("pay")
@RestController
@RefreshScope
public class PaymentController {

    @GetMapping
    public void payByWeixin() {
    }
}