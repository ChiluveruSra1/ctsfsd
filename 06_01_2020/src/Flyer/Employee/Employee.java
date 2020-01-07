package Flyer.Employee;

import java.time.LocalDate;

public class Employee {
	public String employeeId;
	public String employeeName;
	public LocalDate doJ;
		
	public Employee() {
		super();
	}

	public Employee(String employeeId, String employeeName, LocalDate doJ) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.doJ = doJ;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDoJ() {
		return doJ;
	}

	public void setDoJ(LocalDate doJ) {
		this.doJ = doJ;
	}
	
	public String getDetails() {
		return "Employee Id: "+getEmployeeId()+"\nEmployee Name: "+getEmployeeName()+"\nDate of Joining: "+ getDoJ();
	}
	
	
	
}
