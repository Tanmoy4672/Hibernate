package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)throws IOException {
		System.out.println("Project started..");

		// SessionFactory factory = new
		// Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

//      or
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		
		//creating of object file
		StudentAddress address = new StudentAddress();
		address.setStreet("Sultangang Road");
		address.setCity("Dhaka");
		address.setIsOpen(true);
		address.setAddedDate(new Date());
		address.setX(214.213);
		
		//ImageInputData
		FileInputStream file = new FileInputStream("src/main/java/java.jpg");
		byte[] data = new byte[file.available()];
		file.read();
		address.setImage(data);

		Session session = factory.openSession();
		///
		Transaction transction = session.beginTransaction();
		session.save(address);

		transction.commit();

		session.close();
		System.out.println("Done");

	}
}
