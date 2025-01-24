package com.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Getter;
import lombok.Setter;

//@Table(name = "myStudents")the table will be created with mystudents name but entity is Still student
//we have to say hibernate a class and we do that in cfg.xml using mapping attribute

//@Table(name = "myStudents")
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Getter
@Setter
public class Student {
	private String name;
	// @Id is used to create primary key

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	private String city;

	private Certificarte certi;

	/*
	 * public Certificarte getCerti() { return certi; }
	 * 
	 * public void setCerti(Certificarte certi) { this.certi = certi; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, String city, Certificarte certi) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", certi=" + certi + "]";
	}

}
