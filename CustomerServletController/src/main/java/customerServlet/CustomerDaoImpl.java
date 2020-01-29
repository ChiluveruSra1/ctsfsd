package customerServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
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
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}
	
	@Override
	public void updateCustomer(Customer customer) {

		/*
		 * Customer c = session.get(Customer.class,id); String
		 * updateQuery="update table firstName,lastName,email from Customer where id=?";
		 * Query query1=entityManager.createQuery(updateQuery);
		 */
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		System.out.println("updated");

	}

	@Override
	public Customer findById(int id) {
		entityManager.getTransaction().begin();
		Customer c=entityManager.find(Customer.class, id);
		entityManager.getTransaction().commit();
		return c;
	}
}
