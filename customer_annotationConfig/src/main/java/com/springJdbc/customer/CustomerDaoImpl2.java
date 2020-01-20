package com.springJdbc.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Setter
@Component("dao2")
public class CustomerDaoImpl2 implements CustomerDao2 {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		String sql = "insert into customer(first_name,last_name,email,uid) values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { customer.getFirst_name(), customer.getLast_name(), customer.getEmail(),
				customer.getId() });
		return customer;
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		String query = "select uid,first_name,last_name,email from customer";
		return jdbcTemplate.query(query, new CustomerRowMapper());

	}

	@Override
	public List<Customer> findById(Customer customer, String id, CustomerRowMapper rm) throws SQLException {
		String query = "select uid,first_name,last_name,email from customer where uid=?";
		// jdbcTemplate.update(query,new Object[] {id});
		return jdbcTemplate.query(query, new Object[] { id }, new CustomerRowMapper());
	}

	@Override
	public List<Customer> findByLname(Customer customer, String lname, CustomerRowMapper rm) throws SQLException {

		String query = "select uid,first_name,last_name,email from customer where last_name=?";
		return jdbcTemplate.query(query, new Object[] { lname }, new CustomerRowMapper());
	}

	@Override
	public Customer updateCustomer(Customer customer) throws SQLException {

		String query = "update customer set first_name=? ,last_name=?,email=? where uid=?";
		jdbcTemplate.update(query, new Object[] { customer.getFirst_name(), customer.getLast_name(),
				customer.getEmail(), customer.getId() });
		return customer;

	}

	@Override
	public Customer deleteCustomer(Customer customer) throws SQLException {
		String query = "delete from customer where uid=?";
		jdbcTemplate.update(query, new Object[] { customer.getId() });
		return customer;
	}

}
