package com.secondChach;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondCache {

	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		// first
		Student stu1 = session1.get(Student.class, 1044);
		System.out.println(stu1);

		session1.close();

		Session session2 = factory.openSession();
		// second
		Student stu2 = session2.get(Student.class, 1044);
		System.out.println(stu2);

		session2.close();
	}
}
