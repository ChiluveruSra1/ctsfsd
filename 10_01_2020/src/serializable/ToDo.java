package serializable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ToDo implements Serializable{
	private String toDoId;
	private String toDoName;
	private LocalDate date;
	private String i;
	public ToDo(String toDoName, LocalDate date,String i) {
		super();
		this.toDoId = UUID.randomUUID().toString();
		this.toDoName = toDoName;
		this.date = date;
		this.i="18";
	}
	
	

}