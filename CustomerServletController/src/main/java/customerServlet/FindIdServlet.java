package customerServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindIdServlet
 */
public class FindIdServlet extends HttpServlet {
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
			Customer c1 = dao.findById(Integer.parseInt(request.getParameter("customerId")));
			request.setAttribute("customer", c1);
			RequestDispatcher view=request.getRequestDispatcher("update_customer.jsp");
			view.forward(request, response);
			
		} catch (IOException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
