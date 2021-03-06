package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapingDemoManyToMany {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// First Employee Object
		Employee emp1 = new Employee();
		// Second Employee Object
		Employee emp2 = new Employee();

		emp1.setEid(24);
		emp1.setName("Tanmoy");

		emp2.setEid(25);
		emp2.setName("Robin");

		Project pro1 = new Project();
		Project pro2 = new Project();

		pro1.setPid(12121);
		pro1.setProjectName("Library Management.");

		pro2.setPid(13131);
		pro2.setProjectName("ChatBot");

		List<Employee> list1 = new ArrayList<Employee>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(emp1);
		list1.add(emp2);
//
		list2.add(pro1);
		list2.add(pro2);

		//
		emp1.setProjects(list2);
		//
		pro1.setEmployees(list1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// save data
		session.save(emp1);
		session.save(emp2);
		session.save(pro1);
		session.save(pro2);

		tx.commit();
//
//			//data fetching
		Employee newQ = (Employee)session.get(Employee.class, 24);
		System.out.println(newQ.getName());
		
		for(Project a : newQ.getProjects()) {
			System.out.println(a.getProjectName());
		}

		session.close();
		factory.close();
		System.out.println("Done");
	}
}
