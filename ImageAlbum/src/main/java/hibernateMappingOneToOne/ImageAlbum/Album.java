package hibernateMappingOneToOne.ImageAlbum;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int albumId;
	private String albumName;
	private LocalDate crtedOn;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id")
	private Image image;
	
	public Album() {}
	
	public Album(String albumName,LocalDate crtedOn) {
		this.albumName=albumName;
		this.crtedOn=crtedOn;
	}
		
	
	
}
