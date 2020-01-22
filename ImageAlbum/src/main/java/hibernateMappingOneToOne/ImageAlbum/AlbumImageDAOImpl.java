package hibernateMappingOneToOne.ImageAlbum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlbumImageDAOImpl implements AlbumImageDAO {

	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session = HibernateUtil.getSession();
		
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public Album createAlbum(Album album) throws IOException,SQLException {
		transaction = session.getTransaction();
		transaction.begin();
		session.save(album);
		transaction.commit();
		return album;
	}
	
	@Override
	public void findbyId(int id)throws SQLException,StackOverflowError{
	Album a = session.get(Album.class,id);
	if (a == null)
		System.out.println("not found ");
	else {
		StringBuffer buffer=new StringBuffer();
		buffer.append(a.getAlbumId()+" -- "+a.getAlbumName()+" -- "+a.getImage());
		System.out.println(buffer.toString());
	}
	}

	/*
	 * @Override public void findByLname(String albumName) throws SQLException{
	 * Album a = session.get(Album.class,albumName); if (a == null)
	 * System.out.println("not found "); else { StringBuffer buffer1=new
	 * StringBuffer();
	 * buffer1.append(a.getAlbumId()+" -- "+a.getAlbumName()+" -- "+a.getImage());
	 * System.out.println(buffer1.toString()); } }
	 */

	@Override
	public Album updateAlbum(int uId) throws SQLException, IOException {
		Album a = session.get(Album.class, uId);
		if (a == null)
			System.out.println("not found ");
		
		System.out.print("Enter album name: ");
		String name = br.readLine().toString();
		a.setAlbumName(name);
		a.setCrtedOn(LocalDate.now());
		System.out.print("Enter image url: ");
		String url = br.readLine().toString();
		Image tempImage = a.getImage();
		tempImage.setImageURL(url);
		
		a.setImage(tempImage);
		transaction = session.getTransaction();
		transaction.begin();
		session.update(a);
		transaction.commit();
		return a;
	}
	
	@Override
	public Album deleteAlbum(int id) throws SQLException {
		Album a = session.get(Album.class, id);
		if (a == null)
			System.out.println("not found ");
		transaction = session.getTransaction();
		transaction.begin();
		session.delete(a);
		transaction.commit();
		return a;
	}


	
}
