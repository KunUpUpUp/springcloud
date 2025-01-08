package com.seasugar.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Cart {
    private Long id;
    private Long itemId;
    private int itemNum;
    private String itemName;
    private BigDecimal itemPrice;
}