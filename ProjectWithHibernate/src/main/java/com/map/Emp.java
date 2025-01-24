package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	@Column(name = "e_name")
	private String ename;
	
	@ManyToMany(mappedBy = "emp")//u cannot use @JoinTable when using mappedby
	private List<Product> proj;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Product> getProj() {
		return proj;
	}

	public void setProj(List<Product> proj) {
		this.proj = proj;
	}
	
	
	
}
