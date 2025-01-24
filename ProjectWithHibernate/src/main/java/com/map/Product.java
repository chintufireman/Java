package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int pid;
	@Column(name="p_name")
	private String pname;
	
	@ManyToMany
	@JoinTable(name="emp_learn",joinColumns = {@JoinColumn(name="p_id")},inverseJoinColumns = {@JoinColumn(name="e_id")})
	private List<Emp> emp;
	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
}
