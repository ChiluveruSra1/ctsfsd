package com.springJdbc.customer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);

		CustomerDao2 dao2;

		dao2 = context.getBean("dao2", CustomerDao2.class);

		int choice = 0;
		String fName, lName, email, uId;
		List<Customer> list = null;
		Customer customer = null;
		CustomerRowMapper rm = null;
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
				switch (choice) {
				case 1:
					System.err.println("\b Creating Customer");
					System.out.print("enter the no. of customers u want to add: ");
					int n = Integer.parseInt(br.readLine().toString());
					for (int i = 0; i < n; i++) {
						System.out.print(" First Name: ");
						fName = br.readLine().toString();
						System.out.print(" Last Name: ");
						lName = br.readLine().toString();
						System.out.print(" Email: ");
						email = br.readLine().toString();
						String arr[] = UUID.randomUUID().toString().split("-");
						Customer c = dao2.createCustomer(new Customer(arr[1], fName, lName, email));
						System.out.println(c);
						System.err.println("Create Customer Sucess ");
					}
					break;
				case 2:
					System.err.println("\b Displaying all customers");
					// list = dao2.displayAllCustomers();
					// System.err.format("%-20s%-20s%-20s%-20s\n", "ID", "FIRST_NAME", "LAST_NAME",
					// "EMAIL");
					List<Customer> l = dao2.displayAllCustomers();
					l.forEach(c -> {
						System.out.println(c);
					});
					break;
				case 3:
					System.err.println("\b finding customer by ID");
					System.out.print("enter UID: ");
					uId = br.readLine().toString();

					List<Customer> l2 = dao2.findById(customer, uId, rm);
					// System.out.println(l2);

					if (l2.isEmpty()) {
						System.out.println("no such uid found");
					} else {
						System.out.println("customer found: " + l2);
					}
					break;
				case 4:
					System.err.println("\b finding customer by last name");
					System.out.print(" enter last name: ");
					String lname = br.readLine().toString();
					List<Customer> l3 = dao2.findByLname(customer, lname, rm);
					// System.out.println(l2);

					if (l3.isEmpty()) {
						System.out.println("no such last name found");
					} else {
						System.out.println("customer found: " + l3);
					}
					break;
				case 5:
					System.err.println("\b updating customer");
					System.out.print(" UID : ");
					uId = br.readLine().toString();
					list = dao2.findById(customer, uId, rm);
					if (list.isEmpty()) {
						System.out.println("no such uid found");
					} else {
						Customer c = list.get(0);
						System.out.print(" First Name: ");
						fName = br.readLine().toString();
						System.out.print(" Last Name: ");
						lName = br.readLine().toString();
						System.out.print(" Email: ");
						email = br.readLine().toString();

						c.setEmail(email);
						c.setFirst_name(fName);
						c.setLast_name(lName);

						customer = dao2.updateCustomer(c);
						System.out.println("customer updated: " + customer);
					}
					break;
				case 6:
					System.err.println("\b Deleting customer");
					System.out.println("UID: ");
					uId = br.readLine().toString();
					list = dao2.findById(customer, uId, rm);
					if (list.isEmpty()) {
						System.out.println("no such uid found");
					} else {
						Customer c = list.get(0);
						c.setId(uId);
						customer = dao2.deleteCustomer(c);
						System.out.println("delected sucessfully");
					}
					break;

				case 0:
					System.err.println("Dobbey baitiki\n nanne exit avamantava \b");
					System.exit(0);
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
		}

	}
}
