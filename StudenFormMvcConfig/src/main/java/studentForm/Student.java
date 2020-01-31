package studentForm;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter@Setter
public class Student {
	
	@NotNull
	@Size(min = 4,max = 18,message = "invalid name")
	private String fname,lname;
	private String country,favoriteLanguage;
	private String[] os;
	private LinkedHashMap<String, String> countries;
	
	public Student() {
		super();
		countries = new LinkedHashMap<>();
		countries.put("IN",	"India");
		countries.put("BR", "Brazil");
		countries.put("FR", "France");
		countries.put("GER", "Germany");
		countries.put("ITY", "Italy");
		countries.put("US", "United States of America");
		
	}
	
}
