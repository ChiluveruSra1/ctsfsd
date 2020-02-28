package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//@Entity
@Document
@Data
public class Movie {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String mid;
	public String movieName;
	public String genre;
	public String language;
	
	
	
}
