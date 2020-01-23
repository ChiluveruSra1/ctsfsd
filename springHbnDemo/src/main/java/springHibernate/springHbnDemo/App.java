package springHibernate.springHbnDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
    public static void main( String[] args ) throws IOException
    {
    	int choice = 0;
		UserDetails ur = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*try {
			do {
				System.out.println("======================\n1. create User");
				System.out.println("2. create Images");
				System.out.println("3. find album by id");
				System.out.println("4. update album");
				System.out.println("5. delete album");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				int uId;
				switch (choice) {
				case 1:*/
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
			UserSevice service=context.getBean("service",UserSevice.class);
						System.out.print("Enter user name: ");
						String name = br.readLine().toString();
						System.out.print("enter mail address: ");
						String mail = br.readLine().toString();
						String userid[]=UUID.randomUUID().toString().split("-");
						ur=new UserDetails(userid[1], name, mail);
						UserDetails ur1 = service.createUser(ur);
						System.out.println(ur);
						System.err.println("User created");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		/*
		 * break; case 0: System.exit(0); break; default:
		 * System.out.println("invalid choice"); break; }
		 * 
		 * } while (choice != 0);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */

	}
}
