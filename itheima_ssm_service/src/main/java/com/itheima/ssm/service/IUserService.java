package com.itheima.ssm.service;

import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService{
    //查询用户列表
    public List<UserInfo> findAll(Integer page, Integer pageSize);
    //添加用户
    public void save(UserInfo user);
    //查询用户详情
    public UserInfo findById(Integer id);
    //


}
