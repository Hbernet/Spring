package com.hb.controller;

import com.hb.pojo.Person;
import com.hb.service.PersonService;
import com.hb.service.PersonServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author hb
 * @create 2020-06-17 11:05
 */
@Controller
public class PersonController {
    @Resource
    PersonServiceImp personService;

    @RequestMapping("register")
    public String register(Person person){
       boolean flag= personService.insert(person);
       if (flag){
           return "success";
       }else {
           return "fail";
       }
    }

    @RequestMapping("login")
    public String login(Person person , HttpSession session){
//        boolean flag= personService.queryOne(person);
//        if (flag){
            session.setAttribute("name",person.getName());
            return "success";
//        }else {
//            return "fail";
//        }
    }
}
