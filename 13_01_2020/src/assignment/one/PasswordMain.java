package assignment.one;

import com.sun.java_cup.internal.runtime.Scanner;

public class PasswordMain {

	public static void main(String[] args) {
		UserMainCode umc=new UserMainCode();
		boolean c=umc.checkPassword("sdsjS@g23");
		if(c)
			System.out.println("valid Password");
		else
			System.out.println("invalid Password");
	
		
	}

}
