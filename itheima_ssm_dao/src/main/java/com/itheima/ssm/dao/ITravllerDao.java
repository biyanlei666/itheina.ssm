package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

public interface ITravllerDao {
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{orderId});")
    public Traveller findByOrdersId(Integer ordersId);
}
