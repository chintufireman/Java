package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		Question q1 = new Question();
		q1.setQ_id(5634);
		q1.setQuestion("What is women");
		
		Answer ans1 = new Answer(342,"Dont know");
		Answer ans2 = new Answer(12397,"women");
		Answer ans3 = new Answer(78645,"idiot");
		
		List<Answer> l =new ArrayList<Answer>();
		l.add(ans1);
		l.add(ans2);
		l.add(ans3);
		
		q1.setAns(l);
		Transaction tx = s.beginTransaction();
		s.save(q1);
		/*
		 1. Now here the object of Question will definetelty save but we have not given 
		 statement to save answers object so what we can do is we could simply use 
		 cascading so that when u are saving a entity then related to that entity 
		 every other entity which is getting used should be save as well and BOOM,,,,,,,,,,,
		 
		 2.Now how to do that is go to ur Question class and the one where u used 
		 @OneToMany annotation inside that use the cascade parameter and make CascadeType.ALL
		 */
		tx.commit();
		
		s.close();
		factory.close();
	}
}
