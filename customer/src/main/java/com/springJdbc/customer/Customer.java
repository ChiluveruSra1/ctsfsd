package com.springJdbc.customer;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter@Getter
@Component
public class Customer {
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	public Customer(String id,String first_name, String last_name, String email) {
		super();
		this.id=id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ "]";
	}
	
}
