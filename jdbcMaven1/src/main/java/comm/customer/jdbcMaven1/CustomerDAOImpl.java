package comm.customer.jdbcMaven1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import comm.customer.jdbcMaven1.*;

public class CustomerDAOImpl implements CustomerDAO {

	private MyConnectionFactory factory = null;
	private Connection connection = null;
	PreparedStatement pStatement = null;
	static Logger logger = Logger.getLogger("com.customer.jdbcMaven1.CustomerDAOImpl");
	private Customer customer = null;
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
	public Customer createCustomer(Customer customer) throws SQLException {

		pStatement = connection
				.prepareStatement("insert into customer(first_name,last_name,email,uid) values(?,?,?,?)");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.setString(4, customer.getUId());
		pStatement.executeUpdate();
		return customer;
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		pStatement = connection.prepareStatement("select first_name,last_name,email,uid from customer where uid=?");
		pStatement.setString(1, uId);
		ResultSet rSet = pStatement.executeQuery();
		List<Customer> list = new ArrayList<Customer>();
		while (rSet.next()) {
			Customer customer = new Customer(rSet.getString("uid"), rSet.getString("first_name"),
					rSet.getString("last_name"), rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		pStatement = connection.prepareStatement("select uid,first_name,last_name,email from customer");

		ResultSet rSet = pStatement.executeQuery();
		List<Customer> list = new ArrayList<Customer>();
		while (rSet.next()) {
			Customer customer = new Customer(rSet.getString("uid"), rSet.getString("first_name"),
					rSet.getString("last_name"), rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}

	@Override
	public Customer updateCustomer(Customer customer, String uId) throws SQLException {
		// TODO Auto-generated method stub
		pStatement = connection.prepareStatement("update customer set first_name=? ,last_name=?,email=? where uid=?");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.setString(4, uId);
		pStatement.executeUpdate();
		return customer;
	}

	@Override
	public Customer deleteCustomer(Customer customer, String uId) throws SQLException {
		// TODO Auto-generated method stub
		pStatement = connection.prepareStatement("delete from customer where uid=?");
		pStatement.setString(1, uId);
		pStatement.executeUpdate();
		return customer;
	}

	@Override
	public List<Customer> findByLname(String lname) throws SQLException {

		List<Customer> list = new ArrayList<Customer>();
		pStatement = connection
				.prepareStatement("select uid,first_name,last_name,email from customer where last_name=?");
		pStatement.setString(1, lname);
		ResultSet rSet = pStatement.executeQuery();
		while (rSet.next()) {
			Customer customer = new Customer(rSet.getString("uid"), rSet.getString("first_name"),
					rSet.getString("last_name"), rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}

	@Override
	public List<Customer> findByAttribute(String attribute, String et) throws SQLException {
		
		pStatement = connection.prepareStatement("select uid,first_name,last_name,email from customer where ? = ?");
		pStatement.setString(1, attribute);
		pStatement.setString(2, et);
		ResultSet rSet = pStatement.executeQuery();
		List<Customer> list = new ArrayList<Customer>();
		while (rSet.next()) {
			Customer customer = new Customer(rSet.getString("uid"), rSet.getString("first_name"),
					rSet.getString("last_name"), rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}

}