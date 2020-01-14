package com.mycompany.jdbcmaven;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
	public Customer createCustomer(String name, String email) throws SQLException;

	//public Customer displayCustomers(Customer customer);

	List<Customer> getAllCustomers() throws SQLException;

}
