package com.itheima.ssm.dao;

import com.itheima.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Select;
import java.util.List;


public interface IUserDao {
    //查询用户列表
    @Select("select * from users")
    public List<UserInfo> findAll();
    //新增用户
    @Select("insert into users(email,username,password,phoneNum,status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    public void save(UserInfo user);
}
