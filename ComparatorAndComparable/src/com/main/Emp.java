package com.main;

//comparable example by implementing Comparable interface
public class Emp {
	private String name;
	private int id;
	private int phno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", phno=" + phno + "]";
	}

	public Emp(String name, int id, int phno) {
		super();
		this.name = name;
		this.id = id;
		this.phno = phno;
	}

	
}
