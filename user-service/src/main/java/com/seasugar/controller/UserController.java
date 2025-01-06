package com.seasugar.controller;

import com.seasugar.domain.User;
import com.seasugar.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("getUser/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}

