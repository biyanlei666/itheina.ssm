package com.itheima.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private IOrdersService ordersService;
    //分页
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")Integer page,@RequestParam(name = "pageSize",required = true,defaultValue = "10") Integer pageSize) throws Exception{
        List<Orders>ordersList=ordersService.findAll(page,pageSize);
        PageInfo pageInfo = new PageInfo(ordersList);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orders-list");
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(String orderId) throws Exception {
       Orders orders= ordersService.findById(orderId);
       ModelAndView mv=new ModelAndView();
       mv.setViewName("orders-show");
       mv.addObject("orders",orders);
       return mv;
    }
}
