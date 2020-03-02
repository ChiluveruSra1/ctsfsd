package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CurrencyConverter {

	@Id
	public String cfrom;
	public String cto;
	public int rate;
	
}
