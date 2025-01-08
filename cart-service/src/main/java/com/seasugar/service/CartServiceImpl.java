package com.seasugar.service;

import com.seasugar.domain.Cart;
import com.seasugar.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Random;

@Service
public class CartServiceImpl {

    private final DiscoveryClient discoveryClient;

    @Autowired
    private CartMapper cartMapper;

    public CartServiceImpl(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    public void insertCart(Cart cart) {
//        int a = 1 / 0;
        cartMapper.insert(cart);
    }


    public void test() {
        // 这里可以看出nacos返回的是一个列表
        List<ServiceInstance> instances = discoveryClient.getInstances("pay-service");
        if (!CollectionUtils.isEmpty(instances)) {
            for (ServiceInstance instance : instances) {
                System.out.println(instance.getHost() + ":" + instance.getPort());
            }
        }
    }
}
