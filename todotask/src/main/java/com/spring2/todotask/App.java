package com.spring2.todotask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		Todo todo=context.getBean("todo",Todo.class);
    		Task task=context.getBean("task",Task.class);
    		task.setTaskid("123");
    		task.setTaskname("Coding");
    		todo.setTask(task);
    		System.out.println(todo);
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
