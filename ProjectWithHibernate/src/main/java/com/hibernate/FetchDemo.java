package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory(); //hibernate.cfg.xml not
		//hibernate-cfg.xml
		Session s = factory. openSession();
		
		//transaction object is always needed whenever we are saving data	
		//get student 1
		Student student = s.load(Student.class, 1);//load will throw exception of ObjecNotFoundException if there
		//is no object with given id 
		System.out.println(student);
		Address ad = s.get(Address.class, 2);
		//where as get will give null if there is no object found in the db
		//use when u are not sure object is present or not
		
		/*
		1. get() method ke case mai jo object lata hai woh db se woh usko pehele ek cache memory mai store karleta
		hai session ke so that when next time u call for the same object it won't hit database again and simply
		return the object from session memory. dusri bar woh db ko hit nahi karega same object ke liye.
		console mai check karle same object use karle.
		
		2.load() ke case mai aisa hai ki jab aap object mangte ho tab woh original object nahi deta hai
		woh uski proxy or simply ek object deta hai jisme data nahi hota, lekin jab aap us object mai se
		koi value fetch karte ho tab woh object ko initialize karta hai ya fir database ko hit karta hai that's it
		. this increases performance only use when u are sure object presents.
		practical mai object ka use mat karo not even in sysout and just run the code u will see no select 
		query will be fired
		 
		*/
		
		System.out.println(ad.getAddressId()+" "+ad.getCity());
		
		
		s.close();
		factory.close();
		
	}
}
