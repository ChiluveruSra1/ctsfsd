package com.spring2.todotask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@Component("todo")
public class Todo {
	//@Value("${todo.id}")
	private String todoId;
	//@Value("${todo.name}")
	private String todoName;
	@Autowired
	private Task task;
	
	@Override
	public String toString() {
		return "Todo [todoId=" + todoId + ", todoName=" + todoName + ", task=" + task + "]";
	}
	
	
	
}
