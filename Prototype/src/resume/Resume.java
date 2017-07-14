package resume;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Serializable, Cloneable {
	//简历类
	private String name;  
    private String sex;  
    private Integer age;  
    private WorkExperience work;  
      
    public Resume(String name){  
        this.name = name;  
        work = new WorkExperience();  
    }  
    //设置个人信息  
    public void setPersonalInfo(String sex, Integer age){  
        this.sex = sex;  
        this.age = age;  
    }  
    //设置工作经历  
    public void setWorkExperience(String workDate,String company){  
        work.setWorkDate(workDate);  
        work.setCompany(company);  
    }  
    //显示  
    public void display(){  
        System.out.println(String.format("%s %s %s", name,sex,age));  
        System.out.println(String.format("工作经历：%s %s", work.getWorkDate(), work.getCompany()));  
    }  
    //浅复制  
    public Object clone(){  
        Object obj = null;  
        try {  
            obj = super.clone();  
        } catch (CloneNotSupportedException e) {              
            e.printStackTrace();  
        }  
        return obj;  
    }  
    //深复制  
    public Object deepClone() throws IOException, ClassNotFoundException{  
        //将对象写到流里  
        ByteArrayOutputStream bo = new ByteArrayOutputStream();  
        ObjectOutputStream oo = new ObjectOutputStream(bo);  
        oo.writeObject(this);  
        //从流里读出来  
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());  
        ObjectInputStream oi = new ObjectInputStream(bi);  
        return (oi.readObject());  
    }  
}
