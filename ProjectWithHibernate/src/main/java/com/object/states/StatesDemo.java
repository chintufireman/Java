package com.object.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Certificarte;
import com.hibernate.Student;

public class StatesDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Student s1 = new Student();
		s1.setCity("delhi");
		s1.setName("ramesh");
		s1.setId(45532);
		s1.setCerti(new Certificarte("maths","5 years"));
		//student in transient state
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//student object associated with session as well as 
		//with database too that's why this is persistent state
		session.save(s1);
		
		s1.setName("Harshwardhan");
		//now check the query it will not fire insert query it will fire update query 
		//even if we are not using any update or save function
		tx.commit();
		session.close();
		
		//detached:state
		s1.setName("sachin");
		
		//now in removed state u fetch the data from db
		//and then use delete function after the data or object which u are 
		//holding is said to be detached state
		
		factory.close();
	}
}
