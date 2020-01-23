package springHibernate.springHbnDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	private Session session;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		session = sessionFactory.openSession();
	}


	@Override
	public UserDetails createUser(UserDetails user) {
		session.save(user);

		return user;
	}

}