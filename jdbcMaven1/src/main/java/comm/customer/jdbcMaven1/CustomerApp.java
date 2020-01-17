package comm.customer.jdbcMaven1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class CustomerApp {
	private static CustomerService service;
	static {
		service = new CustomerServiceImpl();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
		int choice = 0;
		String fName, lName, email, uId;
		List<Customer> list = null;
		Customer customer = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {

				System.out.println("======================\n1. create customer");
				System.out.println("2. display all customers");
				System.out.println("3. find customer by id");
				System.out.println("4. find customer by last name");
				System.out.println("5. update customer");
				System.out.println("6. delete customer");
				System.out.println("7. find by 'attribute'");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				switch (choice) {
				case 1:
					System.out.println("enter the no. of customers u want to add: ");
					int n = Integer.parseInt(br.readLine().toString());
					for (int i = 0; i < n; i++) {
						System.out.print(" First Name: ");
						fName = br.readLine().toString();
						System.out.print(" Last Name: ");
						lName = br.readLine().toString();
						System.out.print(" Email: ");
						email = br.readLine().toString();
						String arr[] = UUID.randomUUID().toString().split("-");
						Customer theCustomer = new Customer((arr[0] + arr[1]), fName, lName, email);
						customer = service.createCustomer(theCustomer);
						System.out.println("Create Customer Sucess " + customer);
					}
					break;
				case 2:
					list = service.getAllCustomers();
					System.err.format("%-20s%-20s%-20s%-20s\n", "ID", "FIRST_NAME", "LAST_NAME", "EMAIL");
					list.forEach(c -> {
						System.out.format("%-20s%-20s%-20s%-20s\n", c.getUId(), c.getFirstName(), c.getLastName(),
								c.getEmail());
					});
					break;
				case 3:
					System.out.print("enter UID: ");
					uId = br.readLine().toString();
					list = service.findById(uId);
					if (list.isEmpty()) {
						System.out.println("no such uid found");
					} else {
						Customer c = list.get(0);
						System.out.println("customer found: " + c);
					}
					break;
				case 4:
					System.out.print(" enter last name: ");
					String lname = br.readLine().toString();
					list = service.findByLname(lname);

					if (list.isEmpty()) {
						System.out.println("no such last name found");
					} else {
						System.err.format("%-20s%-20s%-20s%-20s\n", "Id", "First Name", "Last Name", "Email\n");
					list.forEach(c -> {
						System.out.format("%-20s%-20s%-20s%-20s\n", c.getUId(), c.getFirstName(), c.getLastName(),
								c.getEmail());
					});}
					break;
				case 5:
					System.out.print(" UID : ");
					uId = br.readLine().toString();
					list = service.findById(uId);
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
						c.setFirstName(fName);
						c.setLastName(lName);
						customer = service.updateCustomer(c, c.getUId());
						System.out.println("customer updated: " + customer);
					}
					break;
				case 6:
					System.out.println("UID: ");
					uId = br.readLine().toString();
					customer = service.deleteCustomer(customer, customer.getUId());
					System.out.println("delected sucessfully");
					break;
				case 7:
					System.out.print("Enter the attribute from which u wnt to find: ");
					String attribute = br.readLine().toString();
					System.out.println("Enter " + attribute + ":");
					String et = br.readLine().toString();

					list = service.findByAttribute(attribute, et);

					if (list.isEmpty()) {
						System.out.println("no such last entity found");
					} else {
						System.err.format("%-20s%-20s%-20s%-20s\n", "Id", "First Name", "Last Name", "Email\n");
						list.forEach(c -> {
							System.out.format("%-20s%-20s%-20s%-20s\n", c.getUId(), c.getFirstName(), c.getLastName(),
									c.getEmail());
						});
					}
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
			System.exit(0);
		}

	}
}