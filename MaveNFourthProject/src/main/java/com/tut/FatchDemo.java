package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FatchDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//get-student
		//in get function ,if object return null value
		Student student = (Student)session.get(Student.class, 101);
		System.out.println(student);
		
		//load-studentAdress
		//load function- it return ObjectNotFoundException
				StudentAddress address = (StudentAddress)session.load(StudentAddress.class, 1);
				System.out.println(address.getStreet()+":"+address.getCity());
		
		session.close();
		factory.close();
	}

}
