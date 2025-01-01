package com.seasugar.service;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class CartServiceImpl {

    private final DiscoveryClient discoveryClient;


    public CartServiceImpl(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    public void test() {
        List<ServiceInstance> instances = discoveryClient.getInstances("pay-service");
        if (!CollectionUtils.isEmpty(instances)) {
//            ServiceInstance instance = instances.get(new Random().nextInt(instances.size()));
            for (ServiceInstance instance : instances) {
                System.out.println(instance.getHost() + ":" + instance.getPort());
            }
        }
    }
}
