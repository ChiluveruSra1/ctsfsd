package employeeAssignment;

import java.util.List;

public class EmployeeBO {

		public static void printEmployees(List<Employee> e1) {
			System.out.format("%-15s %-30s %-30s %-10s %-10s %-5s\n","id","name","dest","DoJ","Age","Salary");
			for(Employee e:e1)
				System.out.println(e);
			
		}
		
		
}
