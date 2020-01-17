package comm.customer.flightBooking;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FCustomerDAOImpl implements FCustomerDAO {
	
	private MyConnectionFactory factory = null;
	private Connection connection = null;
	PreparedStatement pStatement = null;
	static Logger logger = Logger.getLogger("com.customer.jdbcMaven1.CustomerDAOImpl");
	private FCustomer customer = null;
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
	public FCustomer createCustomer(FCustomer theCustomer) throws SQLException {
		//System.out.println(theCustomer);
		pStatement = connection.prepareStatement("insert into fcustomer (uid,password) values(?,?)");
		//System.out.println(pStatement);
		pStatement.setString(1, theCustomer.getUId());
		pStatement.setString(2, theCustomer.getPassword());
		pStatement.executeUpdate();
		return theCustomer;
	}

	@Override
	public List<FCustomer> findById(String uid) throws SQLException {
		pStatement = connection.prepareStatement("select uid,password from fcustomer where uid=?");
		pStatement.setString(1, uid);
		ResultSet rSet = pStatement.executeQuery();
		List<FCustomer> list = new ArrayList<FCustomer>();
		while (rSet.next()) {
			FCustomer customer = new FCustomer(rSet.getString("uid"), rSet.getString("password"));
			list.add(customer);
		}
		return list;
	}

	@Override
	public List<FCustomer> findByPassword(String password1) throws SQLException {
		pStatement = connection.prepareStatement("select uid,password from fcustomer where password=?");
		pStatement.setString(1, password1);
		ResultSet rSet = pStatement.executeQuery();
		List<FCustomer> list = new ArrayList<FCustomer>();
		while (rSet.next()) {
			FCustomer customer = new FCustomer(rSet.getString("uid"), rSet.getString("password"));
			list.add(customer);
		}
		return list;
	}

	
	
}
