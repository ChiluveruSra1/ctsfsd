package customer;

import java.util.Set;

public class CustomerService {
	private CustomerDao cd;
	{
		cd=new CustomerDao();
	}

	public void addCustomer(int cid, String fName, String lName, String email) {
			cd.crtCustomerDao(cid, fName, lName, email);
		}

		public Set<Customer> getAllCustomers(){
			return cd.getAllCustomers();
		}
		
	
	  public static void main(String[] args) {
		  CustomerService cd=new CustomerService(); 
		  cd.addCustomer(1, "sd", "dsgdsg", "jsgklj");
		  Set<Customer> cs= cd.getAllCustomers();
		  System.out.println(cs);
	  
	  }
	 


	}

