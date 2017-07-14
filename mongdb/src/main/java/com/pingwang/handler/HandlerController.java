package com.pingwang.handler;

import com.pingwang.dao.PersonDao;
import com.pingwang.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by 平 on 2017/6/13.
 */
@RestController
@RequestMapping("/mongodb")
public class HandlerController {

    @Autowired()
    @Qualifier("implDao")
    private PersonDao personDao;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insertMongoDB(Person person){
      String result = "insert failure";
        try{
            personDao.insertPerson(person);
            result = "insert success";
        }catch (Exception e){
            result = "insert exception";
        }finally {
            return result;
        }
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Person findMongoDB(@RequestParam("personName") String personName){
        //String result = "find failure";
        Person person = null;
        person = personDao.findPersonByName(personName);
        //result = "find success";
        return person;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateMongoDB(Person person){
        String result = "update failure";
        try{
            int wr = personDao.updatePerson(person);
            if (wr == 1){
                result = "update success";
            }
        }catch (Exception e){

        }finally {
            return result;
        }
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteMongoDB(@RequestParam("personID") Long personID){
        String result = "delete failure";
        try{
            personDao.deletePersonById(personID);
            result = "delete success";
        }catch (Exception e){
            result = "delete exception";
        }finally {
            return result;
        }

    }

}
