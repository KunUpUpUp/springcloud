package com.seasugar.controller;

import com.seasugar.domain.Cart;
import com.seasugar.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cart")
public class CartController {
    @Autowired
    private CartServiceImpl cartService;

    @GetMapping("test")
    public void test() {
        cartService.test();
    }

    @PostMapping("insert")
    public void insertCart(@RequestBody Cart cart) {
        cartService.insertCart(cart);
    }
}
