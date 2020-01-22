package hibernateMappingOneToOne.ImageAlbum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlbumImageDAOImpl implements AlbumImageDAO {

	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session = HibernateUtil.getSession();
		transaction = session.getTransaction();
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public Album createAlbum(Album album) throws IOException,SQLException {
		transaction.begin();
		session.save(album);
		transaction.commit();
		return album;
	}
	
	@Override
	public Album findbyId(String id)throws Exception{
	Album a = session.get(Album.class,id);
	if (a == null)
		System.out.println("not found ");

	return a;
	}

	
}
