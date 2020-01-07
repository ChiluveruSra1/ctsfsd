package comm.test;
import comm.example.*;

import java.util.Scanner;
//import static java.lang.System.*;

public class Tester {
	
	private static Scanner sc=new Scanner(System.in);

	/*
	 * public static void main(String[] args) {											 		//Employee.java
	 * Employee e=Employee.crtEmp(1,"Sravan",28000.00);
	 * e.displayEmp(); }
	 */
	/*
	 * public static void main(String[] args) { 												//Elevator.java
	 * 
	 * Elevator el=new Elevator(); el.mveUpto(5); el.mveDwnto(4); el.mveDwnto(1);
	 * el.mveUpto(11); el.mveUpto(5); el.mveDwnto(11);
	 * 
	 * }
	 */
	static double amount;
	public static void main(String[] args) {													//Account.java
			int ch=-1;
			Account ac1;
			do {
				System.out.println("1. Create Account\n2. Display A/c Details\n0. Exit");
				System.out.println("choose (1,2,0) : ");
				ch=sc.nextInt();
				switch(ch) {
				case 1: 
					System.out.println("Enter Amount: ");
					amount=sc.nextDouble();
					ac1=Account.crtAc(AcType.SAVINGS, amount);
					System.out.println("A/c created..\n");
					break;
				case 2:
					ac1=Account.crtAc(AcType.SAVINGS, amount);
					ac1.displayAc();
					break;
				case 0:
					System.out.println("\bExit");
					break;
				}
			}while(ch!=0);
	
	}
}
