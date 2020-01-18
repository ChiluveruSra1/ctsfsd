package com.springJdbc.customer;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
			CustomerDao dao = context.getBean("dao", CustomerDao.class);
			String arr[]=UUID.randomUUID().toString().split("-");
			Customer c = dao.createCustomer(new Customer(arr[1], "John", "Doe", "john@email.com"));
			System.out.println(c);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
