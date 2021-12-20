package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// 1st student
		Student std = new Student();
		std.setSid(1043);
		std.setName("Rahul");
		std.setCity("Dhaka");

		Certificate certificate = new Certificate();
		certificate.setCourse("Java");
		certificate.setDuration("6 month");

		std.setCerti(certificate);

		// Second Student
		Student std1 = new Student();
		std1.setSid(1044);
		std1.setName("Tarek");
		std1.setCity("Jamalpur");

		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Python");
		certificate1.setDuration("6 month");

		std1.setCerti(certificate1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// object Save
		session.save(std);
		session.save(std1);

		tx.commit();
		session.close();
		factory.close();
		System.out.println("Done");
	}
}
