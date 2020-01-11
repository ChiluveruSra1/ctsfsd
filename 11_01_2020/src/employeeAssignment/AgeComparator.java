package employeeAssignment;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge()>o2.getAge()) {
			return -1;
		}
		else if(o1.getAge()==o2.getAge()) {
			return o1.getDoJ().compareTo(o2.getDoJ());
		}
		else
			return 1;
	}
	
	
	

}
