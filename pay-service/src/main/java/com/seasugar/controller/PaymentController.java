package com.seasugar.controller;

import com.seasugar.domain.request.PayRequest;
import com.seasugar.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RequestMapping("pay")
@RestController
@RefreshScope
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping("wx")
    public void payByWeixin(@RequestBody PayRequest payRequest) {
        paymentService.pay(payRequest);
    }

    @PostMapping
    public void insertUser() {
//        paymentService.insert(order);
    }
}