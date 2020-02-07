package com.example.demo.execptionHandlers;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ItemError {
	private String message;
	private int status;
	private LocalDateTime errorTime;
	public ItemError(String message, int status, LocalDateTime errorTime) {
		super();
		this.message = message;
		this.status = status;
		this.errorTime = errorTime;
	}
	public ItemError() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public LocalDateTime getErrorTime() {
		return errorTime;
	}
	public void setErrorTime(LocalDateTime errorTime) {
		this.errorTime = errorTime;
	}
	
	
	

}
