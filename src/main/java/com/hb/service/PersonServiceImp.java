package com.hb.service;

import com.hb.mapper.PersonMapper;
import com.hb.pojo.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hb
 * @create 2020-06-17 11:05
 */
@Service
public class PersonServiceImp implements PersonService{
    @Resource
    PersonMapper personMapper;
    @Override
    public boolean insert(Person person) {
        int res=personMapper.insert(person);
        if (res>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean queryOne(Person person) {
        Person person1=personMapper.selectOne(person);
        if (person1!=null){
            return true;
        }else {
            return false;
        }

    }
}
