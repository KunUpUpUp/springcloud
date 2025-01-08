package com.seasugar.client;

import com.seasugar.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("order-service")
public interface OrderClient {
    @PostMapping("order/add")
    void insert(@RequestBody Order order);
}
