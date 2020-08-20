package com.hb.service;

import com.hb.pojo.Person;

import java.util.Arrays;

/**
 * @author hb
 * @create 2020-06-17 17:55
 */
public interface CrudService {
    Person query(Person person);

    boolean update(Person person);

    boolean delete(Person person);
}
