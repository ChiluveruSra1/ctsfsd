package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todoId;
	private String todoName;

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public ToDo(int todoId, String todoName) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
	}

	public ToDo() {
		super();
	}
	
	
	
	
	

}
