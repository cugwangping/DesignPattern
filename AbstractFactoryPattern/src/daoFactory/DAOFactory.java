package daoFactory;

import orderDetailDAO.OrderDetailDAO;
import orderMainDAO.OrderMainDAO;

public interface DAOFactory {
	public OrderDetailDAO createOrderDetailDAO();
	public OrderMainDAO createOrderMainDAO();
}
