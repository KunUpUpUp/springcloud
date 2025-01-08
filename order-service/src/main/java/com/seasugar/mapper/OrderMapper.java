package com.seasugar.mapper;

import com.seasugar.domain.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {
    @Select("select * from `order` where id = #{id}")
    public Order getOrder(Long id);

    @Insert("insert into `order` (item_id, item_num, item_name, item_price) values (#{itemId}, #{itemNum}, #{itemName}, #{itemPrice})")
    void insert(Order order);
}