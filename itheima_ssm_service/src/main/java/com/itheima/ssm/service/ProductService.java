package com.itheima.ssm.service;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductService implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
