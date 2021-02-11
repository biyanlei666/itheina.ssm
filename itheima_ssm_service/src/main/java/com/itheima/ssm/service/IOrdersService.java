package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {
   public List<Orders> findAll(Integer page, Integer pageSize) throws Exception;

   public Orders findById(String orderId) throws Exception;

}
