package com.hibernate.taskTodo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor
@Entity@Data
public class TodoTask {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todoId;
	private String id;
	private String name;
	private LocalDateTime crtDateTime;
	
	public TodoTask(String id, String name, LocalDateTime crtDateTime) {
		todoId++;
		this.id=id;
		this.name=name;
		this.crtDateTime=crtDateTime;
	}
}
