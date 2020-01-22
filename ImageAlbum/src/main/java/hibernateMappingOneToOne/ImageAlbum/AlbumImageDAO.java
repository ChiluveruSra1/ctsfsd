package hibernateMappingOneToOne.ImageAlbum;

import java.io.IOException;
import java.sql.SQLException;

public interface AlbumImageDAO {
	Album createAlbum(Album album) throws IOException, SQLException;

	Album findbyId(String id) throws Exception;

}
