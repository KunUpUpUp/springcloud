package com.seasugar.service;

import com.seasugar.client.CartClient;
import com.seasugar.client.OrderClient;
import com.seasugar.domain.Cart;
import com.seasugar.domain.Order;
import com.seasugar.domain.request.PayRequest;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl {

    @Autowired
    private CartClient cartClient;

    @Autowired
    private OrderClient orderClient;


    @GlobalTransactional
    public void pay(PayRequest payRequest) {
        // EDA 事件驱动架构
        // 分布式事务只能管理同步的方法，对于异步的无法处理

        //        new Thread(() -> {
        Order order = new Order();
        BeanUtils.copyProperties(payRequest, order);
        orderClient.insert(order);
//        }).start();
//        new Thread(() -> {
        Cart cart = new Cart();
        BeanUtils.copyProperties(payRequest, cart);
        cartClient.insert(cart);
//        }).start();


    }
}
