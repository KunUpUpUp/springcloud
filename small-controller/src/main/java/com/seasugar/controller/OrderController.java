//package com.seasugar.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RequestMapping("order")
//@RestController
//public class OrderController {
//    @DubboReference
//    private OrderServiceImpl orderService;
//
//    @GetMapping("{id}")
//    public Order getOrder(@PathVariable("id") Long id) {
//        return orderService.getOrderById(id);
//    }
//
//    @PostMapping("add")
//    public void insertUser(@RequestBody Order order) {
//        orderService.insert(order);
//    }
//}