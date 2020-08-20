package com.hb.service;

import com.hb.pojo.Person;

/**
 * @author hb
 * @create 2020-06-17 11:04
 */
public interface PersonService {
    boolean insert(Person person);

    boolean queryOne(Person person);
}
