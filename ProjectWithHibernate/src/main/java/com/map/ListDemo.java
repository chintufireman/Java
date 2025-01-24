package com.map;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ListIndexBase;

@Entity
public class ListDemo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	@ElementCollection //this is the annotation to save simple type of collection
	@CollectionTable(name = "phone_nos",joinColumns = {@JoinColumn(name ="ph_id")})
	//to specify the coulmn name which is joining data
	private List<String> phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public ListDemo(int id, String name, List<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public ListDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ListDemo [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
