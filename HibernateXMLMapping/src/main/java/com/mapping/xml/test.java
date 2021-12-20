package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		
		Person p1 = new Person(23,"Rahim","Rayerbazar","026374718");
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(p1);
		
		tx.commit();

		session.close();
		factory.close();
	}
}
