package com.seasugar.test;

import com.seasugar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public void get() {
        userService.getUser(1L);
    }
}
