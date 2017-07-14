package builder;

import java.util.List;
import java.util.Map;

public interface Builder {
	public void buildHeader(ExportHeader eh);
	//Map中String 为表名称，List是表名称所对应的表数据对象
	public void buildBody(Map<String, List<ExportBody>> mapEb);
	public void buildFooter(ExportFooter ef);
	public StringBuffer getProduct();
}
