package studentForm;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST, path = "/studentLogin")
	public String studentLogin(@ModelAttribute("student") Student student) {
		
		return "student_confirm";

	}

}