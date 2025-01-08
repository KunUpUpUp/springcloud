package com.seasugar.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private Long id;
    private Long itemId;
    private String itemName;
    private Integer itemNum;
    private BigDecimal itemPrice;
}