package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    //查询全部商品
    public List<Product>findAll(Integer page, Integer pageSize);

    //添加商品
    public void save(Product product);
}
