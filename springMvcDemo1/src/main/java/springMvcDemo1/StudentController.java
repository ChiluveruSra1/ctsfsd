package springMvcDemo1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "show_form";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String sName = request.getParameter("sName");
		System.out.println("Student Name: " + sName);

		model.addAttribute("message", sName);
		return "process_form";

	}
}
