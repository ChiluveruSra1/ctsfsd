package Flyer.Employee;

import java.time.LocalDate;
import java.util.UUID;

public class PermanentEmployee extends Employee {
	
	public double salary;
	
	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(String employeeId,String employeeName, LocalDate doJ, double salary) {
		super(employeeId,employeeName,doJ);
		this.salary = salary;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()+ "\nSalary: "+salary;
	}

	public static void main(String[] args) {
		Employee e;
		e=new PermanentEmployee(UUID.randomUUID().toString(),"Sravan",LocalDate.now(),28500);
		System.out.println(e.getDetails());
	}

}
