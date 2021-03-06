package com.example.demo.execptionHandlers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor@AllArgsConstructor

public class ToDoNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String message;

	public ToDoNotFoundException(String message) {
		super();
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	

}
