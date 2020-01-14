package com.mycompany.jdbcmaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

	Customer customer = null;
	private Connection connection = null;
	private ConnectionFactory factory = null;
	PreparedStatement pStmt = null;
	List<Customer> list = null;
	
	{
		factory = ConnectionFactory.getConnectionFactory();
		try {
			connection = factory.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Customer createCustomer(String name, String email) throws SQLException {
		customer = new Customer(name, email);
		pStmt = connection.prepareStatement("insert into customer(name,email) values(?,?)");
		pStmt.setString(1, customer.getName());
		pStmt.setString(2, customer.getEmail());
		pStmt.executeUpdate();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select name,email from employees");
		while (resultSet.next()) {

			list.add(new Customer(resultSet.getString("name"),
					resultSet.getString("email")));

		}

		return list;
	}

	/*
	 * public Customer diplayCustomers() throws SQLException {
	 * 
	 * pStmt = (PreparedStatement) connection.createStatement();
	 * pStmt.executeUpdate("select name,email from customer");
	 * 
	 * return customer;
	 * 
	 * }
	 */

}
