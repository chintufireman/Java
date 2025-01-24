package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Student;

public class CriteriaExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Student.class);
		//c.add(Restrictions.eq("certi.course", "maths"));
		//c.add(Restrictions.gt("id",24));
		c.add(Restrictions.like("certi.course", "english%"));
		List<Student> li = c.list();
		li.stream().forEach(x->System.out.println(x));
		session.close();
	}
}
