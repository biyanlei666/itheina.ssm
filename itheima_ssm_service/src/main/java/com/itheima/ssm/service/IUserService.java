package com.itheima.ssm.service;

import com.itheima.ssm.domain.UserInfo;

import java.util.List;

public interface IUserService {
    //查询用户列表
    public List<UserInfo> findAll(Integer page, Integer pageSize);
    //添加用户
    public void save(UserInfo user);


}
