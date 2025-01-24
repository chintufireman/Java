package com.hql.example;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//HQL
		//syntax
//		String query="from Student where city='delhi'";
		String query="from Student as s where s.city=:x and s.name=:n";
		
		Query q = session.createQuery(query);
		q.setParameter("x", "aurangabad");
		q.setParameter("n", "harsh");
		//single - (unique)
		//multiple- (list)
		
		 List<Student> l = q.list();
		 
		 l.stream().forEach(x->System.out.println(x.getName()));
		session.close();
		factory.close();
	}
}
