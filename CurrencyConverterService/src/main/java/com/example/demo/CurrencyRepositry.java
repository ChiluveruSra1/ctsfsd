package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepositry extends JpaRepository<CurrencyConverter, String> {

	List<CurrencyConverter> findByCfrom(String cfrom);
	List<CurrencyConverter> findByCto(String cto);
	int findByRate(int rate);
	
}
