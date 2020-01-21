package com.hibernate.person;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        String arr[]=UUID.randomUUID().toString().split("-");
        Person person=new Person(arr[1],"Sravan",LocalDate.now());
        session.getTransaction().begin();
        session.save(person);
        session.getTransaction().commit();
        System.out.println(person);
        
        
    }
}
