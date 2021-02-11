package com.itheima.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersService implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;
    @Override
    public List<Orders> findAll(Integer page, Integer pageSize) throws Exception {
        //参数pageNum是页码值 参数pageSize 代表每页显示条数
        PageHelper.startPage(page,pageSize);
        return ordersDao.findAll();
    }
    //查询详情
    @Override
    public Orders findById(String orderId) throws Exception {
        return ordersDao.findById(orderId);
    }
}
