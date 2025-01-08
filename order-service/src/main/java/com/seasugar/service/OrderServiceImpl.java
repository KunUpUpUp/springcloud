package com.seasugar.service;

import com.seasugar.domain.Order;
import com.seasugar.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class OrderServiceImpl {
    @Autowired
    private OrderMapper orderMapper;

    public Order getOrderById(Long id) {
        return orderMapper.getOrder(id);
    }

    public void insert(Order order) {
        orderMapper.insert(order);
    }
}