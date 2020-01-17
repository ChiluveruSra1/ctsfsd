package comm.customer.jdbcMaven1;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import comm.customer.jdbcMaven1.*;

public class CustomerServiceImpl implements CustomerService {
	static Logger logger=Logger.getLogger("com.customer.jdbcMaven1.CustomerServiceImpl");
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
		logger.info("got dao");
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findById(uId);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public Customer updateCustomer(Customer customer,String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer,uId);
	}

	@Override
	public Customer deleteCustomer(Customer customer, String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customer, uId);
	}

	@Override
	public List<Customer> findByLname(String lname) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findByLname(lname);
	}

	@Override
	public List<Customer> findByAttribute(String attribute, String et) throws SQLException {
		return dao.findByAttribute(attribute,et);
	
	}

}