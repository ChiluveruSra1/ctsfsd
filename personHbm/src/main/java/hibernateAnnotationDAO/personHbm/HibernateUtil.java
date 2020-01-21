package hibernateAnnotationDAO.personHbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
	
	private HibernateUtil(){	}
	
	private static SessionFactory factory=new Configuration().configure().addAnnotatedClass(Person1.class).buildSessionFactory();

	public static Session getSession() {
		return factory.openSession();
	}
}
