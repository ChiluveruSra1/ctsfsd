package h2_14_01_2020.h2.connection.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString

public class Customer implements Serializable {

	private static final long serialVersionUID = -6011308522509805328L;
	
	private int cid;
	private String name;
	private String email;
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	/*
	 * public Customer() { // TODO Auto-generated constructor stub }
	 */
	

}
