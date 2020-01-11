package employeeAssignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class MEmployee {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input the number of employees :");
		int n=Integer.parseInt(br.readLine());
		Employee[] e1=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the details for employee "+(i+1));
			String name=br.readLine();
			String department=br.readLine();
			java.util.Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			int age=Integer.parseInt(br.readLine());
			int salary=Integer.parseInt(br.readLine());
			e1[i]=new Employee(name,department,dateOfJoining,age,salary);
			}
			System.out.println("1.Sort employees by salary");
			System.out.println("2.Sort employees by age and by date of joining");
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				//for(int i=0;i<n;i++) {
				List<Employee> l=Arrays.asList(e1);
				Collections.sort(l);
				EmployeeBO.printEmployees(l);
				//}
			break;
		case 2:System.out.println("case 2");
			break;
		case 0:
			System.out.println("bye");
			System.exit(0);
			break;

		default:
			System.out.println("invalid choice");
			break;
		
	}

}


}
