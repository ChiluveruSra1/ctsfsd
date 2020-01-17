package comm.customer.flightBooking;

import java.util.List;

public interface FlightBookingDAO {
	public List<FlightBooking> displayFlightBooking() throws Exception;

	public FlightBooking updateFlightBooking(FlightBooking fb, int l) throws Exception;

}
