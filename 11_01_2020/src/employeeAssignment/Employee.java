package employeeAssignment;

import java.time.LocalDate;
import java.util.Date;


public class Employee implements Comparable<Employee> {
	private int id=0;
	private String name;
	private String dest;
	private Date doJ;
	private int age;
	private int salary;
	static int count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id+1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoJ() {
		return doJ;
	}
	public void setDoJ(Date doJ) {
		this.doJ = doJ;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name, String dest, Date dateOfJoining, int age, int salary) {
		super();
		id=++count;
		this.name = name;
		this.dest = dest;
		this.doJ = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dest=" + dest + ", doJ=" + doJ + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		
		if(salary==e.salary)
			return 0;
		else if(salary>e.salary)
			return 1;
		else
			return -1;
		
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	

}
