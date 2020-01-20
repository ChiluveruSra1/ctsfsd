package com.springJdbc.customer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c=new Customer();
		c.setId(rs.getString("uid"));
		c.setFirst_name(rs.getString("first_name"));
		c.setLast_name(rs.getString("last_name"));
		c.setEmail(rs.getString("email"));
		
		return c;
	}

}
