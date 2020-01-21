package com.hibernate.taskTodo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = new Configuration().configure().addAnnotatedClass(TodoTask.class).buildSessionFactory();
			session = factory.openSession();

			String arr[] = UUID.randomUUID().toString().split("-");
			TodoTask td = new TodoTask(arr[1], "srinivas", LocalDateTime.now());
			session.getTransaction().begin();
			session.save(td);
			session.getTransaction().commit();
			System.out.println(td);
			System.out.println();

			Query q = session.createQuery("from todotask");
			List<TodoTask> l = q.list();
			 for(TodoTask td1 : l)
			  {
			System.out.println("Uid: "+td1.getId()+",Name: "+td1.getName()+",Date Time: "+td1.getCrtDateTime());
			  }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
