package com.hibernate;



import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 
 1. @Embeddable kisi class pe laga diya iska matlab jab koi entity is class ko use
 karegi as a reference and jab uske fields ka data save karne jaegi tab woh bolegi ki this class which 
 i am referencing is Embeddable so what i should do is create this Embeddable class's variable inside new 
 table which i am going to create for current entity. and thus hibernate will simply add these two fields in table
 without even doing all Mapping shit and creating new table 
 */


public class EmpDemo {
	public static void main(String[] args) {
		Configuration cgf = new Configuration();
		SessionFactory factory = cgf.configure("hibernate.cfg.xml").buildSessionFactory();
		Student student1 = new Student();
		
		student1.setId(134);
		student1.setName("awd");
		student1.setCity("afdwaw");
		
		Student student2 = new Student();
		
		student2.setId(356423);
		student2.setName("ravi");
		student2.setCity("pune");
		
		Certificarte c1 = new Certificarte();
		c1.setCourse("mathdf");
		c1.setDuration("2 months");
		
		Certificarte c2 = new Certificarte();
		c2.setCourse("physics");
		c2.setDuration("7 months");
		
		student1.setCerti(c1);
		student2.setCerti(c2);
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(student1);
		s.save(student2);
		tx.commit();
		s.close();
		factory.close();
	}
}
