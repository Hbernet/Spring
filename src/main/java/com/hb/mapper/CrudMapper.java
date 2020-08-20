package com.hb.mapper;

import com.hb.pojo.Person;

import java.util.Arrays;

/**
 * @author hb
 * @create 2020-06-17 18:00
 */
public interface CrudMapper {
    Person query(Person person);

    int update(Person person);

    int insert(Person person);

    int delete(Person person);
}
