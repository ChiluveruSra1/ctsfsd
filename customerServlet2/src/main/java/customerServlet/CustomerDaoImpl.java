package customerServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;


public class CustomerDaoImpl implements CustomerDao {

	private Session session;
	private EntityManager entityManager;

	{
		session = CustomerUtil.getMySessionFactory().openSession();
		
		session.getTransaction().begin();
		entityManager=session.getEntityManagerFactory().createEntityManager();
		
		session.getTransaction().commit();
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException, IOException {

		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;

	}

	@Override
	public List<Customer> getAllCustomers() {
		Query query=entityManager.createQuery("from customer",Customer.class);
		return query.getResultList();
	}
	
}
