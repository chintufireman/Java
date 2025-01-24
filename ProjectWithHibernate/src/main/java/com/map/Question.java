package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int q_id;
	private String question;
	//onetoone annotation will create a foreign key if u dont specify its name then it will create default 
	//class name column
	@OneToMany(mappedBy = "ques",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Answer> ans;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Question(int q_id, String question, List<Answer> ans) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.ans = ans;
	}




	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", question=" + question + ", ans=" + ans + "]";
	}




	public List<Answer> getAns() {
		return ans;
	}




	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}




	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
