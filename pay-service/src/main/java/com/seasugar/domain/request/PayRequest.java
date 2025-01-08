package com.seasugar.domain.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayRequest {
    private Long orderId;
    private Long cartId;
    private Long itemId;
    private int itemNum;
    private String itemName;
    private BigDecimal itemPrice;
}
