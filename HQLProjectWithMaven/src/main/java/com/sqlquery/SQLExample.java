package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hql.Student;

public class SQLExample {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// sql query
		String sql = "select * from student";

		NativeQuery nq = session.createSQLQuery(sql);

		List<Object[]> list = nq.list();
		for (Object[] stu : list) {
			System.out.println(Arrays.toString(stu));
		}

		System.out.println("_________________________________________");

		for (Object[] st : list) {
			System.out.println(st[4] + ":" + st[3]);
		}

		session.close();
		factory.close();
	}
}
