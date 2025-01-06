package com.seasugar.service;

import com.seasugar.client.UserClient;
import com.seasugar.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserClient client;

    public void getUser(Long id) {
        User user = client.findById(id);
        System.out.println(user);
    }
}
