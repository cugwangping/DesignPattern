package builder;

import java.util.List;
import java.util.Map;

public class XmlBuilder implements Builder {
	
	/**
	 * 用来记录Xml文件的内容，相当于产品Product
	 * 
	 */
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void buildHeader(ExportHeader eh) {
		// TODO Auto-generated method stub
		buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
		//<Report>
		buffer.append("<Report>\n");
		//	<Header>
		buffer.append("\t<Header>\n");
		//		<DepId>一分公司</DepId>
		buffer.append("\t\t<DepId>"+eh.getDepId()+"</DepId>\n");
		//		<ExportDate>2010-05-18</ExportDate>
		buffer.append("\t\t<ExportDate>"+eh.getExportDate()+"</ExportDate>\n");
		buffer.append("\t</Header>\n");
	}

	@Override
	public void buildBody(Map<String, List<ExportBody>> mapEb) {
		// TODO Auto-generated method stub
		buffer.append("\t<Body>\n");  
        for(String tableName : mapEb.keySet()){  
            //获取表名称  
            buffer.append("\t\t<Datas TableName=\""+tableName+"\">\n");  
            //分条描述数据  
            for(ExportBody eb : mapEb.get(tableName)){  
                  
                buffer.append("\t\t\t<Data>\n");  
                  
                buffer.append("\t\t\t\t<ProductId>"+eb.getProductId()+"</ProductId>\n");  
                buffer.append("\t\t\t\t<Price>"+eb.getPrice()+"</Price>\n");  
                buffer.append("\t\t\t\t<Amount>"+eb.getAmount()+"</Amount>\n");  
                  
                buffer.append("\t\t\t</Data>\n");  
            }  
              
            buffer.append("\t\t</Datas>\n");  
        }  
        buffer.append("\t</Body>\n");
	}

	@Override
	public void buildFooter(ExportFooter ef) {
		// TODO Auto-generated method stub
		/**
			*	<Footer>
			*		<ExportUser>张三</ExportUser>
			* 	</Footer>
			*</Report>
		 */
		 buffer.append("\t<Footer>\n");  
	     buffer.append("\t\t<ExportUser>"+ef.getExportUser()+"</ExportUser>\n");  
	     buffer.append("\t</Footer>\n");  
	     buffer.append("</Report>\n");  
	}
	
	public StringBuffer getProduct(){
		return buffer;
	}

}
