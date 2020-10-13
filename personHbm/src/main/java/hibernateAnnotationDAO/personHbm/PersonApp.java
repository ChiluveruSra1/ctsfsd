package hibernateAnnotationDAO.personHbm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.hibernate.Transaction;

public class PersonApp {
	private static Person1Dao dao;
	static {
		dao=new Person1DaoImpl();
	}

	public static void main(String[] args) {
		int choice = 0;
		Person1 person=null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {
				System.out.println("======================\n1. create customer");
				System.out.println("2. display all customers");
				System.out.println("3. find customer by id");
				System.out.println("4. find customer by last name");
				System.out.println("5. update customer");
				System.out.println("6. delete customer");
				// System.out.println("7. find by 'attribute'");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				String uId;
				switch (choice) {
				case 1:
					/*System.out.println("enter the no. of customers u want to add: ");
					int n = Integer.parseInt(br.readLine().toString());
					for (int i = 0; i < n; i++) {
						*/System.out.println("your id is generated by system");
						System.out.print("Enter your name: ");
						String name = br.readLine().toString();
						String id[]=UUID.randomUUID().toString().split("-");
						Person1 p = dao.createCustomer(new Person1(id[1], name, LocalDate.now()));
						System.out.println(p);
						System.err.println("Create Customer Sucess ");
						System.out.println("-------------------------------------------------------------\n");
						
					//}
					break;
				case 2:
					List<Person1> l=dao.displayAllPersons();
					l.forEach(c -> {
						System.out.println(c);
					});
					/*
					 * for(Person1 p1 : l) {
					 * System.out.println("Uid: "+p1.getId()+",Name: "+p1.getName()+",Date Time: "
					 * +p1.getDate()); }
					 */
					break;
				case 3:
					System.out.print("enter UID: ");
					uId = br.readLine().toString();
					System.out.println(dao.findById(uId));
					break;
				case 4:
					System.out.print(" enter name: ");
					String rname = br.readLine().toString();
					System.out.println(dao.findByLname(rname));
					break;
				case 5:
					System.out.print("enter UID: ");
					uId = br.readLine().toString();
					System.out.println(dao.updateCustomer(uId));
					break;
				case 6:
					System.out.print("enter UID: ");
					uId = br.readLine().toString();
					System.out.println(dao.deleteCustomer(uId));
					break;

				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
}