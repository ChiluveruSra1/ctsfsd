package hibernateMappingOneToMany.PostComment1;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter@Getter
public class Comment /* extends Post */ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int commentId;
	String commentTxt;
	LocalDateTime cmtDtT;
		 

	public Comment(String commentTxt, LocalDateTime cmtDtT) {
		this.commentTxt = commentTxt;
		this.cmtDtT = cmtDtT;
	}
	
	
}
