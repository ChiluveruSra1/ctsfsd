package com.spring2.todotask;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor@AllArgsConstructor
@Setter@Getter
@Component
public class Task {
	private String taskid;
	private String taskname;
	
	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskname=" + taskname + "]";
	}
	
}
