package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import builder.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //准备测试数据  
        ExportHeader eh = new ExportHeader();  
        eh.setDepId("一分公司");  
        eh.setExportDate("2010-05-18");  
          
        Map<String, List<ExportBody>> mapEb = new HashMap<String, List<ExportBody>>();  
        List<ExportBody> leb = new ArrayList<ExportBody>();  
          
        ExportBody eb1 = new ExportBody();  
        eb1.setProductId("产品001号");  
        eb1.setPrice(100);  
        eb1.setAmount(80);  
          
        ExportBody eb2 = new ExportBody();  
        eb2.setProductId("产品002号");  
        eb2.setPrice(99);  
        eb2.setAmount(55);  
          
        leb.add(eb1);  
        leb.add(eb2);   
          
        mapEb.put("销售记录表", leb);  
          
        ExportFooter ef = new ExportFooter();  
        ef.setExportUser("张三");  
          
        //测试输出到文本文件  
        TxtBuilder txtBuilder = new TxtBuilder();  
        //创建指导者对象  
        Director director1 = new Director(txtBuilder);  
        director1.construct(eh, mapEb, ef);  
          
        //把要输出的内容输出到控制台看看  
        System.out.println("输出到文本文件的内容:\n"+txtBuilder.getProduct().toString());  
          
        XmlBuilder xmlBuilder = new XmlBuilder();  
        Director director2 = new Director(xmlBuilder);  
        director2.construct(eh, mapEb, ef);  
          
        //把要输出的内容输出到控制台看看  
        System.out.println("输出到Xml文件的内容:\n"+xmlBuilder.getProduct().toString());  
	}

}
