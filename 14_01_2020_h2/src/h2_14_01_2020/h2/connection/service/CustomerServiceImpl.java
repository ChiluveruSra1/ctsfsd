package h2_14_01_2020.h2.connection.service;

import java.sql.SQLException;
import java.util.List;

import h2_14_01_2020.h2.connection.data.Customer;
import h2_14_01_2020.h2.connection.data.CustomerDao;
import h2_14_01_2020.h2.connection.data.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}

	@Override
	public Customer createCustomer(String name, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(name, email);
	}

	
	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	


}