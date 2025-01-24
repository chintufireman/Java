package com.student.manage;

public class Student {
	private String name;
	private String city;
	private String phone;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public Student(String name, String city, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public Student(String name, String city, String phone, int id) {
		super();
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.id = id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", phone=" + phone + ", id=" + id + "]";
	}
	
}
