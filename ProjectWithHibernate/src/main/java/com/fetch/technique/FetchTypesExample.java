package com.fetch.technique;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Question;

public class FetchTypesExample {
 public static void main(String[] args) {
	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		
		Question q1 = (Question)session.get(Question.class, 5634);
		
		System.out.println(q1.getQ_id()); //no query o/p for ans lists this is by default lazy loading
		
		System.out.println(q1.getAns().size()); //this will print the anss lists coz of lazy loading when we are 
		//using associted class
		/*
		 now to use eager laoding u have to use in @OnetoMany annotation fetch type in Question class
		 and run the program it will get data for anss too
		 */
		
		session.close();
		factory.close();
}
}
