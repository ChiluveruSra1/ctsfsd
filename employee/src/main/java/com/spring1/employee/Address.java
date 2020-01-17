package com.spring1.employee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor
public class Address {
	private String ad1;
	private String ad2;
	private String pincode;
	private String mobileno;
	
	public String getDetails() {
		return "Address ["+ad1 + " " + ad2 + " - " + pincode + ", mobileno=" + mobileno + "]";
	}
	

}

