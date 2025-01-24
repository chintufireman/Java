package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(1);
		e1.setEname("harsh");
		
		e2.setEid(23);
		e2.setEname("ramesh");
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setPid(3412);
		p1.setPname("nokia");
		
		p2.setPid(78);
		p2.setPname("tax");
		
		List<Emp> le = new ArrayList<Emp>();
		List<Product> lp = new ArrayList<Product>();
		
		le.add(e1);
		le.add(e2);
		
		lp.add(p1);
		lp.add(p2);
		
		e1.setProj(lp);
		
		p2.setEmp(le); 
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
