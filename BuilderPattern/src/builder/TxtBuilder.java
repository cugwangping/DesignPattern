package builder;

import java.util.List;
import java.util.Map;

public class TxtBuilder implements Builder {
	
	//导出到文本文件
	
	 /** 
     * 用来记录构建的文件的内容，相当于产品 Product
     */  
    private StringBuffer buffer = new StringBuffer();     
	
    //构建头信息
	@Override
	public void buildHeader(ExportHeader eh) {
		// TODO Auto-generated method stub
		buffer.append(eh.getDepId()+","+eh.getExportDate()+"\n");	
	}
	
	//构建中间数据模块信息
	@Override
	public void buildBody(Map<String, List<ExportBody>> mapEb) {
		// TODO Auto-generated method stub
		//获取表名称
		for(String tableName:mapEb.keySet()){
			buffer.append(tableName+"\n");
			
			//分条描述表数据
			for(ExportBody eb:mapEb.get(tableName)){
				buffer.append(eb.getProductId()+","+eb.getPrice()+","+eb.getAmount()+"\n");
			}
		}
		
	}
	
	//构建尾信息
	@Override
	public void buildFooter(ExportFooter ef) {
		// TODO Auto-generated method stub
		buffer.append(ef.getExportUser());
	}
	
	//获取最后组装好的产品
	public StringBuffer getProduct(){
		return buffer;
	}

}
