package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ListDemoMain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		String s1 = "67rf";
		String s2 = "acswjr";
		String s3 = "dawad5";
		String s4 = "sfcdu6a";
		String s5 = "rf894";
		String s6 = "w4eh5";
		List<String> li = new ArrayList<String>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		ListDemo ld = new ListDemo();
		ld.setName("This is Collection to hibernate");
		ld.setPhone(li);
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
	
		session.save(ld);
		tx.commit();
		
		session.close();
		factory.close();
	}
}
