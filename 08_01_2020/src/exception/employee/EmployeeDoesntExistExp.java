package exception.employee;

public class EmployeeDoesntExistExp extends Throwable {
	
	public EmployeeDoesntExistExp(String msg) {
		super(msg);
	}
	
}
