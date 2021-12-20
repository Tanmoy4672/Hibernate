package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args){
		System.out.println("Project started..");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

//      or
//        Configuration cfg = new Configuration();
//        cfg.configure();
//        SessionFactory factory = cfg.buildSessionFactory();

		//creating student
		Student student = new Student();
		student.setSid(102);
		student.setName("Abir");
		student.setCity("Dhaka");
		System.out.println(student);
		
		
		
		
		
		Session session = factory.openSession();
		///
		Transaction transction = session.beginTransaction();
		session.save(student);
		

		transction.commit();

		session.close();
		System.out.println("Done");
		

	}
}
