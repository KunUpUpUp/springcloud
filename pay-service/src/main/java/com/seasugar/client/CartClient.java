package com.seasugar.client;

import com.seasugar.domain.Cart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("cart-service")
public interface CartClient {
    @PostMapping("cart/insert")
    void insert(@RequestBody Cart cart);
}
