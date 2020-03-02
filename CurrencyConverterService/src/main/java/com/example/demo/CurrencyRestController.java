package com.example.demo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRestController {
	
	CurrencyConverter cc;
	
	private CurrencyService currencyService;

	@Autowired
	public CurrencyRestController(CurrencyService currencyService) {
		super();
		this.currencyService = currencyService;
	}
	
	@RequestMapping("/from/{cfrom}/to/{cto}/{amt}")
	public int convert(@PathVariable String cfrom,@PathVariable String cto, @PathVariable int amt) {

		int result=-1;
		List<CurrencyConverter> from = currencyService.findByCfrom(cfrom);
		List<CurrencyConverter> to = currencyService.findByCto(cto);
		if ((!from.isEmpty())&& (!to.isEmpty()))
			result=amt*70;
	
		return result;
		
		
		/*int result=0;
		if(currencyService.findByCfrom(cfrom)) {
			result=amt*70;
		}
		
		return result;*/

	}

}
