package customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerDao { //DAO-- data access object
	Set<Customer> customerSet=new HashSet<Customer>();

	public void crtCustomerDao(int cid, String fName, String lName, String email) {
		customerSet.add(new Customer(cid, fName, lName, email));
	}

	public Set<Customer> getAllCustomers(){
		return customerSet;
	}
	/*
	 * public static void main(String[] args) { CustomerService cs=null;
	 * cs.addCustomer(1, "stsd", "kdsjk", "sdjkl"); Set<Customer> s=
	 * cs.getAllCustomers(); System.out.println(s);
	 * 
	 * }
	 */
	
}
