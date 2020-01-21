package hibernateAnnotationDAO.personHbm;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor@AllArgsConstructor
@Setter@Getter
@ToString
@Entity
@Table(name="person1")
public class Person1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	//@Column(name = "name")       if DB name are different
	private String name;
	private LocalDate date;
	
	
}
