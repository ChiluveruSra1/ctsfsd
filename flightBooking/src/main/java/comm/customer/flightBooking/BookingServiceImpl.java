package comm.customer.flightBooking;

import java.sql.SQLException;
import java.util.List;

public class BookingServiceImpl implements BookingService {

	private FCustomerDAO cdao;
	private FlightBookingDAO fdao;
	{
		cdao = new FCustomerDAOImpl();
		fdao = new FlightBookingDAOImpl();
	}

	@Override
	public List<FCustomer> findById(String uid) throws SQLException {
		// TODO Auto-generated method stub
		return cdao.findById(uid);
	}

	@Override
	public FCustomer createCustomer(FCustomer theCustomer) throws SQLException {
		// TODO Auto-generated method stub
		return cdao.createCustomer(theCustomer);
	}

	@Override
	public List<FlightBooking> displayFlightBooking() throws Exception {
		// TODO Auto-generated method stub
		return fdao.displayFlightBooking();
	}

	@Override
	public List<FCustomer> findByPassword(String password1) throws SQLException {
		// TODO Auto-generated method stub
		return cdao.findByPassword(password1);
	}

	@Override
	public FlightBooking updateFlightBooking(FlightBooking fb, int noofseats) throws Exception {
		// TODO Auto-generated method stub
		return fdao.updateFlightBooking(fb,noofseats);
	}

}
