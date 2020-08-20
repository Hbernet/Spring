package com.hb.service;

import com.hb.mapper.CrudMapper;
import com.hb.pojo.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author hb
 * @create 2020-06-17 17:55
 */
@Service
public class CrudServiceImpl implements CrudService{
   @Resource
   CrudMapper crudMapper;
    @Override
    public Person query(Person person) {
        return crudMapper.query(person);
    }

    @Override
    public boolean update(Person person) {

        int res=crudMapper.update(person);
        if (res>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean insert(Person person){
        int res=crudMapper.insert(person);
        if (res>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(Person person) {
        int res=crudMapper.delete(person);
        if (res>0){
            return true;
        }else {
            return false;
        }
    }
}
