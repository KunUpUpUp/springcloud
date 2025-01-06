package com.seasugar.mapper;

import com.seasugar.domain.Cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {

    @Insert("INSERT INTO cart (item_id,item_num,item_name,item_price) VALUES(#{itemId},#{itemNum},#{itemName},#{itemPrice})")
    public void insert(Cart cart);
}