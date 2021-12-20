package com.firstChach;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.Student;

public class FirstChachDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// by default enable

		Student student = session.get(Student.class, 1044);
		System.out.println(student);

		System.out.println("Working something..Saving data in Chach memory.");
		// first level chaching , that is provided in Default

		Student student1 = session.get(Student.class, 1044);
		System.out.println(student1);

		// varify that chach in the object or not
		System.out.println(session.contains(student1));

		session.close();
		
	}
}
