package comm.customer.jdbcMaven1;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
	
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	Customer deleteCustomer(Customer customer, String uId) throws SQLException;
	public List<Customer> findByLname(String lname) throws SQLException;
	public List<Customer> findByAttribute(String attribute, String et) throws SQLException;

}