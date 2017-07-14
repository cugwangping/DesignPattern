package resume;

import java.io.Serializable;

public class WorkExperience implements Serializable {
	//工作经历类
	private String workDate;  
	private String company; 
	
	//工作时间
    public String getWorkDate() {  
        return workDate;  
    } 
    
    public void setWorkDate(String workDate) {  
        this.workDate = workDate;  
    }  
    
    //工作的公司
    public String getCompany() {  
        return company;  
    }  
    
    public void setCompany(String company) {  
        this.company = company;  
    }  
}
