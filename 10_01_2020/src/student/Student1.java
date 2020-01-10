package student;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor@AllArgsConstructor@Setter@Getter@ToString
@EqualsAndHashCode
public class Student1 implements Comparator {
	private String sname;
	private int rollno;

	/*
	 * @Override public int compare(Student1 o1, Student1 o2) { // TODO
	 * Auto-generated method stub return
	 * (o1.getSname().compareToIgnoreCase(o2.getSname())); }
	 */

	@Override
	public int compare(Object o1, Object o2) {
		
		return (((Student1) o1).getSname().compareTo(((Student1) o2).getSname()));
	}
	
	public static void main(String[] args) {
		Set<Student1> set=new HashSet<Student1>();
		set.add(new Student1("John2", 8));
		set.add(new Student1("Marry",7));
		set.add(new Student1("john1", 9));
		set.add(new Student1("sravan", 9));
		Iterator<Student1> itr=set.iterator();
		while (itr.hasNext()) 
            System.out.print(itr.next() + "\n"); 
		}


}
