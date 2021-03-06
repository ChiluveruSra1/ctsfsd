package com.springJdbc.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pStatement;
	private static Logger logger = Logger.getLogger("com.springJdbc.customer.CustomerDaoImpl");

	@Autowired
	public CustomerDaoImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@PostConstruct
	public void init() {
		try {
			logger.info("creating connection");
			connection = dataSource.getConnection();
			logger.info("connection established.");
		} catch (SQLException e) {

			e.printStackTrace();
			logger.info("connection unsuccesfull.");
		}
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatement = connection.prepareStatement("insert into customer(id,first_name,last_name,email) values(?,?,?,?)");
		pStatement.setString(1, customer.getId());
		pStatement.setString(2, customer.getFirst_name());
		pStatement.setString(3, customer.getLast_name());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}

}
