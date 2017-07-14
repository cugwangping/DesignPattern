package com.pingwang.vo;

/**
 * Created by 平 on 2017/6/12.
 */
public class Person {

    private Long personID;   //用户ID
    private String personName;  //用户名
    private String sex;     //用户性别


    private Long age;   //用户年龄
    private String email;       //用户联系方式：email

    public Person(){}

    public Person(Long personID, String personName, String sex, Long age, String email) {
        this.personID = personID;
        this.personName = personName;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public Long getPersonID() {
        return personID;
    }

    public String getPersonName() {
        return personName;
    }

    public String getSex() {
        return sex;
    }

    public Long getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
