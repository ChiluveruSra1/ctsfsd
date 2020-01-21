package com.hibernate.person;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor@AllArgsConstructor
@Setter@Getter
@ToString

//@Table(name="person1")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	//@Column(name = "name")       if DB name are different
	private String name;
	private LocalDate date;
}
