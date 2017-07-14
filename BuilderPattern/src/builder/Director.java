package builder;

import java.util.List;
import java.util.Map;

public class Director {
	private Builder builder;
	
	//构造对象时传入Builder 对象
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(ExportHeader eh, 
			Map<String, List<ExportBody>> mapEb, ExportFooter ef){
		//第一步，构建文件头
		builder.buildHeader(eh);
		//第二步，构建数据
		builder.buildBody(mapEb);
		//第三步，构建文件尾
		builder.buildFooter(ef);
	}
}
