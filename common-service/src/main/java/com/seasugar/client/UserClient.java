package com.seasugar.client;

import com.seasugar.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {
    @GetMapping("user/getUser/{id}")
    User findById(@PathVariable("id") Long id);
}
