package com.seasugar.controller;

import com.seasugar.domain.Order;
import com.seasugar.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("order")
@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("{id}")
    public Order getOrder(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }
}
