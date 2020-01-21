package hibernateAnnotationDAO.personHbm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Person1DaoImpl implements Person1Dao {

	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session = HibernateUtil.getSession();
		transaction = session.getTransaction();
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public Person1 createCustomer(Person1 person) throws SQLException, IOException {

		transaction.begin();
		session.save(person);
		transaction.commit();
		return person;

	}

	@Override
	public List<Person1> displayAllPersons() throws SQLException {
		Query q = session.createQuery("from person1");
		return q.list();
	}

	@Override
	public Person1 findById(String id) throws SQLException {
		Person1 p = session.get(Person1.class, id);
		if (p == null)
			System.out.println("not found ");

		return p;
	}

	@Override
	public Person1 findByLname(String rname) throws SQLException {
		Person1 p = session.get(Person1.class, rname);
		if (p == null)
			System.out.println("not found ");

		return p;
	}

	@Override
	public Person1 updateCustomer(String id) throws SQLException, IOException {
		Person1 p = session.get(Person1.class, id);
		if (p == null)
			System.out.println("not found ");
		System.out.print("Enter name: ");
		p.setName(br.readLine().toString());
		p.setDate(LocalDate.now());
		transaction.begin();
		session.update(p);
		transaction.commit();

		return p;
	}

	@Override
	public Person1 deleteCustomer(String id) throws SQLException {
		Person1 p = session.get(Person1.class, id);
		if (p == null)
			System.out.println("not found ");
		transaction.begin();
		session.delete(p);
		transaction.commit();

		return p;
	}

}
