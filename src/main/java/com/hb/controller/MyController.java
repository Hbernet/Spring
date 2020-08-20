package com.hb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hb
 * @create 2020-06-16 21:08
 */
@Controller
public class  MyController {
    @RequestMapping("main")
    public String tomain(){
        return "main";
    }

    @RequestMapping("tools")
    public String totools(){
        return "tools";
    }

    @RequestMapping("test")
    public ModelAndView test(String name){
        ModelAndView modelAndView = new  ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("name", name);
        System.out.println(name);
        return modelAndView;
    }
}
