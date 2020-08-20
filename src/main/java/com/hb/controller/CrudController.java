package com.hb.controller;

import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.hb.pojo.Person;
import com.hb.service.CrudServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author hb
 * @create 2020-06-17 17:49
 */
@Controller
public class CrudController {
    @Resource
    CrudServiceImpl crudService;

    @ResponseBody
    @RequestMapping("query")
    public Person query(Person person) {

        return  crudService.query(person);
    }
    @RequestMapping("update")
    public String update(Person person){
        boolean flag=crudService.update(person);
        if (flag){
            return "success";
        }else {
            return "fail";
        }
    }
    @RequestMapping("insert")
    public String insert(Person person){
        boolean flag=crudService.insert(person);
        if (flag){
            return "success";
        }else {
            return "fail";
        }
    }
    @RequestMapping("delete")
    public String delete(Person person){
        boolean flag=crudService.delete(person);
        if (flag){
            return "success";
        }else {
            return "fail";
        }
    }
}
