package hibernateMappingOneToOne.ImageAlbum;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
	
	
	private HibernateUtil(){	
		
		Logger logger=Logger.getLogger("org.hibernate");
		logger.setLevel(java.util.logging.Level.OFF);
	}
	
	private static SessionFactory factory=new Configuration().configure().addAnnotatedClass(Album.class).addAnnotatedClass(Image.class).buildSessionFactory();

	public static Session getSession() {
		return factory.openSession();
	}
}
