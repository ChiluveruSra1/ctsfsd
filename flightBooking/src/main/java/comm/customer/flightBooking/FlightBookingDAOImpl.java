package comm.customer.flightBooking;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FlightBookingDAOImpl implements FlightBookingDAO {

	private MyConnectionFactory factory = null;
	private Connection connection = null;
	PreparedStatement pStatement = null;
	static Logger logger = Logger.getLogger("com.customer.jdbcMaven1.CustomerDAOImpl");
	private FlightBooking fb = null;

	{
		factory = MyConnectionFactory.getFactoryObject();
		try {
			logger.info("connection started");
			connection = factory.getMyConnection();
			logger.info("got connection");

		} catch (IOException | SQLException e) {

			e.printStackTrace();
			logger.info("connection unsucessfull");
		}
	}

	@Override
	public List<FlightBooking> displayFlightBooking() throws Exception {
		pStatement = connection.prepareStatement("select flightno,noofseats from flightbooking");

		ResultSet rSet = pStatement.executeQuery();
		List<FlightBooking> list = new ArrayList<FlightBooking>();
		while (rSet.next()) {
			FlightBooking fb = new FlightBooking(rSet.getString("flightno"), rSet.getInt("noofseats"));
			list.add(fb);
		}
		return list;
	}

	@Override
	public FlightBooking updateFlightBooking(FlightBooking fb1,int noofseats) throws Exception {
		pStatement = connection.prepareStatement("update customer set noofseats=? where flightno=?");
		pStatement.setInt(1, fb1.getNoofseats()-noofseats);
		pStatement.setString(2, fb1.getFlightno());
		pStatement.executeUpdate();
		return fb1;

	}

}
