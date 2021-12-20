package com.pagination;

import org.hibernate.query.Query;

import com.hql.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPagination {
	public static void main(String[] args) {
        
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	Query<Student> query = session.createQuery("from Student");
	
	//implementing pegination using hibernate
	query.setFirstResult(0);
	query.setMaxResults(5);
	
	List<Student> list = query.list();
	for(Student stu :list) {
		System.out.println(stu.getSid()+":"+stu.getName()+":"+stu.getCity());
	}
	
	session.close();
	factory.close();
	}
}
