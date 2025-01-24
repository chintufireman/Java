package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project started...");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		//Student s = new Student("harsh", 2,"delhi");
		Student s = new Student();
		s.setCity("delhi");
		s.setName("harshw");
		System.out.println(s);
		Address ad = new Address();
		ad.setCity("delhi");
		ad.setStreet("1");
		ad.setOpen(true);
		ad.setX(343.344);
		ad.setAddedDate(new Date());
		
		//reading image 
		FileInputStream fis = new FileInputStream("src/main/java/aaf99555e9660a7c1517e0651eccf126--anime-d-anime-meme.jpg");
		byte[] data = new byte[fis.available()];
		//fis.read(data);
		ad.setImage(data);
		
		
		//factory se session nikal liya
		Session session=factory.openSession();
		//and session se transaction object for commiting
		Transaction tx = session.beginTransaction();
		
		//session use karliya save ke liye
		session.save(s);
		session.save(ad);
		System.out.println("Done....");
		tx.commit();
		session.close();
		
	}
}
