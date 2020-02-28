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
public class User {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String id;
	public String firstName;
	public String lastName;
	public String email;
	
	
	
}
