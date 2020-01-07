package comm.example;

import static java.lang.System.out;

public class Employee {

	private int eid;
	private String eName;
	private double esal;
	
		public Employee(int id, String name, double sal) {
		eid = id;
		eName = name;
		esal = sal;
	}

	public static Employee crtEmp(int id, String name, double sal) {
		return new Employee(id,name,sal);
	}

	public void displayEmp() {
		out.print("Employee ID: " + eid + "\nEmployee Name: " + eName + "\nEmployee Salary: " + esal);
	}
	
	

}
