package student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Student implements Comparable {
	private String sName;
	private String sId;
	private double cgpa;

	@Override
	public int compareTo(Object obj) {
		
		if(obj instanceof Student) {
			
		}
		int gpa=0;
		if(this.getCgpa()>((Student) obj).getCgpa())
		{
			gpa= 1;
		}
		if(this.getCgpa()<((Student) obj).getCgpa())
		{
			gpa= -1;
		}
		 if(this.getCgpa()==((Student) obj).getCgpa())
		{
			gpa= 0;
		}
		return gpa;
		
	}
	
	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		String s[]=UUID.randomUUID().toString().split("-");
		set.add(new Student("John", s[1], 8));
		set.add(new Student("Marry",s[0],7.8));
		set.add(new Student("Sachin", s[4], 9));
		Iterator<Student> itr=set.iterator();
		while (itr.hasNext()) 
            System.out.print(itr.next() + "\n"); 
		
	}
}
	
