package com.hb.controller;

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;
import com.hb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author hb
 * @create 2020-06-18 20:43
 */
@Controller
public class DateController {

    @RequestMapping("date")
    @ResponseBody
    public User todate(User user) {

       return user;
    }
}
