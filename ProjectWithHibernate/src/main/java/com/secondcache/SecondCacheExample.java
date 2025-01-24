package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class SecondCacheExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1 = (Student) session.get(Student.class, 352);
		System.out.println(s1.getId()+" "+s1.getName());
		session.close();
		
		Session session2=factory.openSession();
		
		Student s2 = session2.get(Student.class, 352);
		System.out.println(s2.getId()+" "+s2.getName());
		
		//now check the logs there will no query fire even when first session has been closed bcoz
		//sessionfactory is now holding the objects in cache this 2nd level cache
		session2.close();
		factory.close();
	}
}
