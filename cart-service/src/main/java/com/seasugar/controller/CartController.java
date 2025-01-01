package com.seasugar.controller;

import com.seasugar.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cart")
public class CartController {
    @Autowired
    private CartServiceImpl cartService;

    @GetMapping("test")
    public void test() {
        cartService.test();
    }
}
