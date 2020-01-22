package hibernateMappingOneToOne.ImageAlbum;

import java.io.IOException;
import java.sql.SQLException;

public interface AlbumImageDAO {
	Album createAlbum(Album album) throws IOException, SQLException;

	void findbyId(int uId) throws SQLException, StackOverflowError;

	/* void findByLname(String albumName) throws SQLException; */

	Album updateAlbum(int uId) throws SQLException, IOException;

	Album deleteAlbum(int id) throws SQLException;

}
