package com.springJdbc.customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao2 {

	Customer createCustomer(Customer customer) throws SQLException;
	List<Customer> displayAllCustomers() throws SQLException;
	List<Customer> findById(Customer customer,String id,CustomerRowMapper rm) throws SQLException;
	List<Customer> findByLname(Customer customer,String lname,CustomerRowMapper rm) throws SQLException;
	Customer updateCustomer(Customer customer) throws SQLException;
	Customer deleteCustomer(Customer customer) throws SQLException;
}
