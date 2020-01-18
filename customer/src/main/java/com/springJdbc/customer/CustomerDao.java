package com.springJdbc.customer;

import java.sql.SQLException;

public interface CustomerDao {

	Customer createCustomer(Customer customer) throws SQLException;

}
