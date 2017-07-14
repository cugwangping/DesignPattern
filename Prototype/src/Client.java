import java.io.IOException;

import resume.*;

public class Client {
	//客户端测试类
	public static void main(String[] args){
		//  a和b的WorkExperience的引用值是一样的  
		System.out.println("WorkExperience的引用值一样......");
		Resume a = new Resume("王平");  
	    a.setPersonalInfo("男", 20);  
	    a.setWorkExperience("1998-2000", "xx公司");  
	    //浅复制  
	    Resume b = (Resume)a.clone();  //浅复制
	    b.setWorkExperience("1998-2006", "yy公司");  
	    b.setPersonalInfo("男", 22);  
	      
	    a.display();  
	    b.display();  
	    
	    //  a和b的WorkExperience的引用值是不同的
	    System.out.println("WorkExperience的引用值不一样......");
	    Resume c = new Resume("王平");  
	    c.setPersonalInfo("男", 25);  
	    c.setWorkExperience("1998-2000", "xx公司");  
	    //深复制  
	    Resume d;
		try {
			d = (Resume)c.deepClone();		//深复制
			d.setWorkExperience("1998-2006", "yy公司");  
		    d.setPersonalInfo("男", 25);  
		                  
		    c.display();  
		    d.display(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
