
package customerServlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

public class UpdateServlet extends HttpServlet {
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
			Customer c1 = dao.findById(Integer.parseInt(request.getParameter("customerId")));
			c1.setFirstName(request.getParameter("fname"));
			c1.setLastName(request.getParameter("lname"));
			c1.setEmail(request.getParameter("email"));
			dao.updateCustomer(c1);
			RequestDispatcher view=request.getRequestDispatcher("HomeController.do");
			view.forward(request, response);
			
			
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
