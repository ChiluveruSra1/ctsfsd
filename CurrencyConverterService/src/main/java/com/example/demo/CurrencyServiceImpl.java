package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	private CurrencyRepositry currencyRepositry;

	@Autowired
	public CurrencyServiceImpl(CurrencyRepositry currencyRepositry) {
		super();
		this.currencyRepositry = currencyRepositry;
	}

	@Override
	@Transactional
	public List<CurrencyConverter> findByCfrom(String cfrom) {
		return currencyRepositry.findByCfrom(cfrom);
	}

	@Override
	@Transactional
	public List<CurrencyConverter> findByCto(String cto) {
		return currencyRepositry.findByCto(cto);
	}

	@Override
	public int findByRate(int rate) {
		return currencyRepositry.findByRate(rate);
	}
	  
	

}
