package h2_14_01_2020.h2.connection.data;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
	public Customer createCustomer(String name,String email) throws SQLException;

	List<Customer> getAllCustomers() throws SQLException;

}
