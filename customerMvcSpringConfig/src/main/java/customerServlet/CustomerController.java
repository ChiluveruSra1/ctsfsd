package customerServlet;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("customer", new Customer());
		return "list";
	}

	/*
	 * @RequestMapping(method = RequestMethod.POST, path = "/processLogin") public
	 * String processLogin(@ModelAttribute("customer") Customer customer) { if
	 * ((user.getEmail().equals("admin@mail.com")) &&
	 * (user.getPassword().equals("admin"))) { return "add_cd"; } else { return
	 * "error"; }
	 * 
	 * }
	 * 
	 * 
	 * @RequestMapping(method = RequestMethod.GET, path = "/addCD") public String
	 * addCd() { return "add_cd"; }
	 */

	@RequestMapping("/processCustomer")
	public String processForm(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, Model theModel) {
		Customer cd = new Customer(firstName, lastName, email);

		theModel.addAttribute("cd", cd);

		return "success_cd";
	}

}