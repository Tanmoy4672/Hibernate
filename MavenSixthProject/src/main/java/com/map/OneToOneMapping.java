package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// uni directional OneToOne
		Question ques1 = new Question();
		ques1.setQuestionId(1212);
		ques1.setQues("What is Java ?");

		Question ques2 = new Question();
		ques2.setQuestionId(1213);
		ques2.setQues("What is collection Framework ?");

		Question ques3 = new Question();
		ques3.setQuestionId(1214);
		ques3.setQues("How to work with netbeans ?");

		Answer ans1 = new Answer();
		ans1.setAnswerId(343);
		ans1.setAnswer("Java is a programmming language");
		ans1.setQuestion(ques1);

		Answer ans2 = new Answer();
		ans2.setAnswerId(344);
		ans2.setAnswer("API for work with group of Object");
		ans2.setQuestion(ques2);

		Answer ans3 = new Answer();
		ans3.setAnswerId(345);
		ans3.setAnswer("IDE for writting code");
		ans3.setQuestion(ques3);

		// connect all answer to Question
		ques1.setAnsCol(ans1);
		ques2.setAnsCol(ans2);
		ques3.setAnsCol(ans3);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// object Save
		session.save(ques1);
		session.save(ques2);
		session.save(ques3);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);

		tx.commit();
		
		
		//data fetching
		Question newQ = (Question)session.get(Question.class, 1212);
		System.out.println(newQ.getQues());
		System.out.println(newQ.getAnsCol().getAnswer());
		
		
		session.close();
		factory.close();
		System.out.println("Done");
	}
}
