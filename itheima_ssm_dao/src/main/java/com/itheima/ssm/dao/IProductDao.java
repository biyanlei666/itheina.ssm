package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface IProductDao {
    //通过id查询商品
    @Select("select * from product where id=#{id}")
    public Product findById(Integer id) throws Exception;

    //查询所有的产品信息
    @Select("select * from product")
    public List<Product>findAll();

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,ProductStatus)values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product product);
}
