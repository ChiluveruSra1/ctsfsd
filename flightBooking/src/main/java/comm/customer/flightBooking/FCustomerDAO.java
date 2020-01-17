package comm.customer.flightBooking;

import java.sql.SQLException;
import java.util.List;

public interface FCustomerDAO {
	public List<FCustomer> findById(String uid) throws SQLException;

	public FCustomer createCustomer(FCustomer theCustomer) throws SQLException;

	public List<FCustomer> findByPassword(String password1) throws SQLException;

}
