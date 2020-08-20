package com.hb.mapper;

import com.hb.pojo.Person;

import java.util.List;

/**
 * @author hb
 * @create 2020-06-15 20:11
 */
public interface PersonMapper {
    List<Person> selectAll();

    int insert(Person person);

    Person selectOne(Person person);
}
