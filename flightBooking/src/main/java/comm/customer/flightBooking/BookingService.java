package comm.customer.flightBooking;

import java.sql.SQLException;
import java.util.List;

public interface BookingService {

	public List<FCustomer> findById(String uid) throws SQLException;

	public FCustomer createCustomer(FCustomer theCustomer) throws SQLException;

	public List<FlightBooking> displayFlightBooking() throws Exception;

	public List<FCustomer> findByPassword(String password1) throws SQLException;

	public FlightBooking updateFlightBooking(FlightBooking fb, int noofseats) throws Exception;



}
