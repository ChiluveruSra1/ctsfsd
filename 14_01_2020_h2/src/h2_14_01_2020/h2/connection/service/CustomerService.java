package h2_14_01_2020.h2.connection.service;

import java.sql.SQLException;
import java.util.List;

import h2_14_01_2020.h2.connection.data.Customer;

public interface CustomerService {
	public Customer createCustomer(String name, String email) throws SQLException;

	//public Customer displayCustomers(Customer customer);

	List<Customer> getAllCustomers() throws SQLException;

}
