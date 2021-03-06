package com.itheima.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.ssm.domain.UserInfo;
import com.itheima.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    //查询全部用户
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")Integer page,@RequestParam(name = "pageSize",required = true,defaultValue = "10")Integer pageSize){
        List<UserInfo> userList = userService.findAll(page, pageSize);
        PageInfo pageInfo=new PageInfo(userList);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user-list");
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }
    //新增用户
    @RequestMapping("/save.do")
    public String save(UserInfo user){
        userService.save(user);
        return "redirect:findAll.do";
    }
    //查询用户详情
    @RequestMapping("findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true)Integer id){
        UserInfo userInfo = userService.findById(id);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user-show");
        mv.addObject("user",userInfo);
        return mv;
    }
}
