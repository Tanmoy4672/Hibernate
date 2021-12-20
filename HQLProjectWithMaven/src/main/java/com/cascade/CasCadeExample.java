package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.join.AnswerTable;
import com.join.QuestionTable;

public class CasCadeExample {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		QuestionTable q1 = new QuestionTable();
		q1.setQuestionId(567);
		q1.setQues("What is Cascading ?");
		
		AnswerTable ans1 = new AnswerTable(2345, "In hibernate it is important concept.");
		AnswerTable ans2 = new AnswerTable(2346,"Second Answer.");
		AnswerTable ans3 = new AnswerTable(2347,"Third Answer.");
		
		List<AnswerTable> list = new ArrayList<AnswerTable>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		q1.setAnswers(list);
		Transaction tx = session.beginTransaction();
		session.save(q1);
		tx.commit();
		
		factory.close();
		session.close();
	}
}
