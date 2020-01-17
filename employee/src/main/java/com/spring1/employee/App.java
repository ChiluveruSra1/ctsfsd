package com.spring1.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicatiionContext.xml");
			Employee employee = context.getBean("employee", Employee.class);
			Address address = context.getBean("address", Address.class);
			// Employee employee1=context.getBean("employee",Employee.class);
			// System.out.println(employee==employee1);
			System.out.println(employee.getDetails() + " " + address.getDetails());
		} catch (Exception e) {

		}
	}
}
