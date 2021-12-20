package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class StateDemo 
{
    public static void main( String[] args )
    {
        //Practical of Hibernate Object States: 
    	//Trasient State
    	//Persistent State
    	//Detached State
    	//Removed State
    	System.out.println("Example: ");
    	
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	//createing student Object
    	
    	StudentState std1 = new StudentState();
    	std1.setSid(1414);
    	std1.setName("Jannat");
    	std1.setCity("Dhaka");
    	std1.setCerti(new CertificateState("Java Hibernate Course","2 month"));
    	//std1 : Transient
    	
    	//Connect to Database
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(std1);
    	//std1 : Persistant --Session,Database
    	std1.setName("Tanmoy");
    	
    	
    	
    	tx.commit();
    	
    	session.close();
    	//std1 : Detached State
    	
    	
    	session.close();
    }
}
