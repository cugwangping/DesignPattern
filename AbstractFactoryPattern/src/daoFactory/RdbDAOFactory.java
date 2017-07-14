package daoFactory;

import orderDetailDAO.*;
import orderMainDAO.*;

public class RdbDAOFactory implements DAOFactory {

	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		// TODO Auto-generated method stub
		return new RdbDetailDAOImpl();
	}

	@Override
	public OrderMainDAO createOrderMainDAO() {
		// TODO Auto-generated method stub
		return new RdbMainDAOImpl();
	}

}
