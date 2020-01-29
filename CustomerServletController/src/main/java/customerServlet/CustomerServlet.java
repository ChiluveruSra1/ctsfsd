package customerServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao dao;

	@Override
	public void init() throws ServletException {

		super.init();
		dao = new CustomerDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			String fname = request.getParameter("fname");
			System.out.println(fname);
			String lastName = request.getParameter("lname");
			System.out.println(lastName);
			String email = request.getParameter("email");
			System.out.println(email);
			Customer c = new Customer(fname, lastName, email);

			dao.createCustomer(c);

			//if (c1 != null) {
				
				List<Customer> customers=dao.getAllCustomers();
				request.setAttribute("customers", customers);
				/*
				 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				RequestDispatcher view = request.getRequestDispatcher("index.jsp");
				view.forward(request, response);
			//}
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * protected void doProcess(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * try { response.setContentType("text/html");
	 * 
	 * PrintWriter out = response.getWriter(); String fname =
	 * request.getParameter("fname"); String lname = request.getParameter("lname");
	 * String email = request.getParameter("email"); Customer c=new Customer(fname,
	 * lname, email);
	 * 
	 * Customer c1=dao.createCustomer(c);
	 * 
	 * if(c1!=null) { out.println("Successfully add customer with id: "+c1.getId());
	 * request.setAttribute("SUCCESS", c1); RequestDispatcher
	 * view=request.getRequestDispatcher("index.html"); view.forward(request,
	 * response); } } catch (SQLException | IOException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * }
	 */

}
