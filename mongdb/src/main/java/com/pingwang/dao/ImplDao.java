package com.pingwang.dao;


import com.mongodb.*;
import com.pingwang.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by 平 on 2017/6/13.
 */
@Component
public class ImplDao implements PersonDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insertPerson(Person person){
        BasicDBObject queryDoc = new BasicDBObject("personID",person.getPersonID())
                .append("personName",person.getPersonName())
                .append("sex",person.getSex())
                .append("email",person.getEmail());
        mongoTemplate.getCollection("person").insert(queryDoc);
    }

    @Override
    public Person findPersonByName(String personName){
        BasicDBObject queryDoc = new BasicDBObject("personName",personName);
        //DBCursor cursor = mongoTemplate.getCollection("person").find(queryDoc);
        DBCollection coll = mongoTemplate.getCollection("person");
        DBCursor cursor =coll.find(queryDoc);
        Person person = null;
        try{
        if(cursor.hasNext()){
            DBObject obj = cursor.next();
            person = new Person(Long.valueOf(obj.get("personID").toString()),
                    obj.get("personName").toString(),
                    obj.get("sex").toString(),
                    Long.valueOf(obj.get("personID").toString()),
                    obj.get("email").toString());
        }}catch(Exception e){
            System.out.println(e.getMessage());
        }
        return person;
    }

    @Override
    public int updatePerson(Person person) {
        BasicDBObject queryDoc = new BasicDBObject("personID",person.getPersonID());
        BasicDBObject setDoc = new BasicDBObject("$set", new BasicDBObject("personName",person.getPersonName()));
        WriteResult wr = mongoTemplate.getCollection("person").update(queryDoc,setDoc);
        return wr.getN();
    }

    @Override
    public void deletePersonById(Long id) {
        BasicDBObject queryDoc = new BasicDBObject("personID",id);
        mongoTemplate.getCollection("person").remove(queryDoc);
    }
}
