package com.example.demo;

import java.util.List;

public interface CurrencyService {
	
	public List<CurrencyConverter> findByCfrom(String cfrom);

	public List<CurrencyConverter> findByCto(String cto);

	public int findByRate(int rate);





}
