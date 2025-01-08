package com.seasugar.controller;

import com.seasugar.domain.Order;
import com.seasugar.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("order")
@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("{id}")
    public Order getOrder(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("add")
    public void insertUser(@RequestBody Order order) {
        orderService.insert(order);
    }
}