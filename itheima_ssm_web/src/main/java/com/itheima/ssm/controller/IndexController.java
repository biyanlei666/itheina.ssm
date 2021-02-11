package com.itheima.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class IndexController {
    @RequestMapping("index.do")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("main");
        return mv;
    }
}
