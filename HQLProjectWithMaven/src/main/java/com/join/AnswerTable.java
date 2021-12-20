package com.join;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerTable {
	
	@Id
	private int answerId;
	private String answer;
	
	@ManyToOne
	private QuestionTable question;
	
	
	public AnswerTable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AnswerTable(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}


	public int getAnswerId() {
		return answerId;
	}


	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public QuestionTable getQuestion() {
		return question;
	}


	public void setQuestion(QuestionTable question) {
		this.question = question;
	}



	
	
}
