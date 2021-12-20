package com.hql;

import java.util.Arrays;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExample {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		//HQL Syntax
		String query = "from Student as s where s.city=:x and s.name=:n";
	    Query<Student> q= session.createQuery(query);
		q.setParameter("x", "Jamalpur");
		q.setParameter("n", "Tarek");
		
		//single - (Unique)
		//multiple - list
		List<Student> list = q.list();
		
		for(Student student : list) {
			System.out.println(student.getSid()+":"+student.getName()+":"+student.getCerti().getCourse());
		}
		System.out.println("_______________________________________");
		

		Transaction tx = session.beginTransaction();
		
		//deleting query
//		Query q2 = session.createQuery("delete from Student s where s.city=:c"); //you can do without writting "as"
//		q2.setParameter("c","Dhaka");
//		
//		int r = q2.executeUpdate();
//		System.out.println("Deleted..");
//		System.out.println(r);
//		
		
		//update query
		Query q3 = session.createQuery("update Student set city=:c where name=:n");
		q3.setParameter("c", "Dhaka");
		q3.setParameter("n", "Tarek");
		
		int r = q3.executeUpdate();
		System.out.println(r+"Objects update");
		
		
		tx.commit();
		
		System.out.println("__________________________");
		//How to execute join query
		Query q4 = session.createQuery("select q.ques, q.questionId,a.answer from QuestionTable as q INNER JOIN q.answers as a");
		List<Object []> list3 = q4.getResultList();
		for(Object [] array : list3) {
			System.out.println(Arrays.toString(array));
		}
		
		
		
		session.close();
		factory.close();
	}
}
