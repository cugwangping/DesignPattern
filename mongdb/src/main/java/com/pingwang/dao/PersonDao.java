package com.pingwang.dao;

import com.pingwang.vo.Person;

/**
 * Created by 平 on 2017/6/13.
 */
public interface PersonDao {
    void insertPerson(Person person);   // 增
    Person findPersonByName(String personName);     // 查
    int updatePerson(Person person);   // 改
    void deletePersonById(Long id);     // 删
}
