package com.mycompany.jdbcmaven;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
	public Customer createCustomer(String name,String email) throws SQLException;

	List<Customer> getAllCustomers() throws SQLException;

}
