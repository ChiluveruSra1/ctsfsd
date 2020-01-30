package cdControllerPkg;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cd")
public class CdController {
	
		
		@RequestMapping(method = RequestMethod.GET,path = "/addCD")
		public String addCd()
		{
			return "add_cd";
		}
		
		@RequestMapping("/processCd")
		public String processForm(@RequestParam("title") String title,
				@RequestParam("gridRadios") String type,
				@RequestParam("date") String date,Model theModel)
		{	
			CdClass cd=new CdClass(title,type,date);
	
			theModel.addAttribute("cd",cd);
			
			return "success_cd";
		}

	}