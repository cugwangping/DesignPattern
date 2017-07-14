package daoFactory;

import orderDetailDAO.*;
import orderMainDAO.*;

public class XmlDAOFactory implements DAOFactory {

	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		// TODO Auto-generated method stub
		return new XmlDetailDAOImpl();
	}

	@Override
	public OrderMainDAO createOrderMainDAO() {
		// TODO Auto-generated method stub
		return new XmlMainDAOImpl();
	}

}
