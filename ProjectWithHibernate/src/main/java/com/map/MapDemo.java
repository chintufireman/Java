package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Question q1 = new Question();
		q1.setQ_id(1);
		q1.setQuestion("what is java lang");

		Answer ans1 = new Answer();
		ans1.setA_id(342);
		ans1.setAns("coding lang");
		ans1.setQues(q1);
		 
		Answer ans2 = new Answer();
		ans2 .setA_id(32423);
		ans2.setAns("OOP");
		ans2.setQues(q1);
		
		Answer ans3 = new Answer();
		ans3.setA_id(897);
		ans3.setAns("Java EE");
		ans3.setQues(q1);
		List<Answer> l = new ArrayList<Answer>();
		l.add(ans1);
		l.add(ans2);
		l.add(ans3);
		q1.setAns(l);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		tx.commit();
		
		//Question ques = session.get(Question.class, 1);
		//System.out.println(ques.getQuestion());
	//	System.out.println(ques.getAns().getAns());
		session.close();
		factory.close();
	}
}
