package com.mycompany.jdbcmaven;

import java.sql.SQLException;
import java.util.List;

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