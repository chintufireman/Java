package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int a_id;
	private String ans;
	/*
	 	always remember in one to many relationship the class which u are using with one to many annotation
	 	and it is using reference of another class then that class will have many to one annotation not 
	 	@onetomany one.
	  */
	@ManyToOne 
	private Question ques;

	public int getA_id() {
		return a_id;
	}

	public Answer(int a_id, String ans) {
		super();
		this.a_id = a_id;
		this.ans = ans;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	public Answer(int a_id, String ans, Question ques) {
		super();
		this.a_id = a_id;
		this.ans = ans;
		this.ques = ques;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
