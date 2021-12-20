package com.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int questionId;
	private String ques;
	@OneToOne
	@JoinColumn(name="ans_col")
	private Answer ansCol;
	
	
	

	public Question(int questionId, String ques, Answer ansCol) {
		super();
		this.questionId = questionId;
		this.ques = ques;
		this.ansCol = ansCol;
	}


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getQuestionId() {
		return questionId;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public String getQues() {
		return ques;
	}


	public void setQues(String ques) {
		this.ques = ques;
	}


	public Answer getAnsCol() {
		return ansCol;
	}


	public void setAnsCol(Answer ansCol) {
		this.ansCol = ansCol;
	}
	

	
	
}
