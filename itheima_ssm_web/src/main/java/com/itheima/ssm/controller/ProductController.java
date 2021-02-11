package com.itheima.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    //查询全部
    @RequestMapping("/findAll.do")
    public ModelAndView finAll(@RequestParam(name = "page",required = true,defaultValue ="1")Integer page,@RequestParam(name = "pageSize",required = true,defaultValue = "10")Integer pageSize){
        List<Product> products = productService.findAll(page,pageSize);
        PageInfo pageInfo=new PageInfo(products);
        ModelAndView mv=new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("product-list");
        return mv;
    }

    //产品添加
    @RequestMapping("/save.do")
    public String save(Product product){
        productService.save(product);
        return "redirect:findAll.do";
    }

}
