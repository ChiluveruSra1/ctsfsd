package customerServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
	public Customer createCustomer(Customer customer) throws SQLException, IOException;
	public List<Customer> getAllCustomers();
	public void updateCustomer(Customer c);
	public Customer findById(int id);

}
