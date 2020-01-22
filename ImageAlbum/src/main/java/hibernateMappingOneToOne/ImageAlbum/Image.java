package hibernateMappingOneToOne.ImageAlbum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	private String imageURL;
	
	public Image(String imageURL) {
		this.imageURL = imageURL;
	}

	@OneToOne(mappedBy = "image", cascade = CascadeType.ALL)
	private Album album;
	
	
	
}
