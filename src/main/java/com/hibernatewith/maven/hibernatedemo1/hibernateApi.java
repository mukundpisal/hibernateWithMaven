package com.hibernatewith.maven.hibernatedemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateApi {
	public static void main(String[] args) {
		  System.out.println("-------done------");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session =factory.openSession();
	System.out.println(factory);
	  System.out.println("-------done------");

	 Transaction tx = session.beginTransaction();
	 student1 s = new student1("Ram", "Mech", 2022);
	 student1 s1 = new student1("Sham", "comp", 2021);
	 student1 s2 = new student1("Pranav", "It", 2020);
	 student1 s3 = new student1("Vaibhav", "e&tc", 2020);
	 student1 s4 = new student1("Rushi", "mech", 2020);

	 

	 session.save(s); 
	 session.save(s1); 
	 session.save(s2); 
	 session.save(s3); 
	 session.save(s4); 

//	 session.get(student, 1);
	 
	 tx.commit();
	  System.out.println("-------done------");
	}
	

}
