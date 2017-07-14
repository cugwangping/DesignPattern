import daoFactory.*;
import orderDetailDAO.*;
import orderMainDAO.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//处理Xml订单
		DAOFactory dfx = new XmlDAOFactory();	//建立xml工厂对象
		//调用Xml主订单
		OrderMainDAO omXd = dfx.createOrderMainDAO();
		omXd.orderMainDAO();
		//调用Xml子订单
		OrderDetailDAO odXd = dfx.createOrderDetailDAO();
		odXd.orderDetailDAO();
		
		//处理Rdb订单	
		DAOFactory dfr = new RdbDAOFactory();	//建立rdb工厂对象
		//调用Rdb主订单
		OrderMainDAO omRd = dfr.createOrderMainDAO();
		omRd.orderMainDAO();
		//调用Rdb子订单
		OrderDetailDAO odrd = dfr.createOrderDetailDAO();
		odrd.orderDetailDAO();
	}

}
