package com.join;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionTable {
	
	@Id
	private int questionId;
	private String ques;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<AnswerTable> answers;
	
	

	

	public QuestionTable(int questionId, String ques, List<AnswerTable> answers) {
		super();
		this.questionId = questionId;
		this.ques = ques;
		this.answers = answers;
	}


	public QuestionTable() {
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


	public List<AnswerTable> getAnswers() {
		return answers;
	}


	public void setAnswers(List<AnswerTable> answers) {
		this.answers = answers;
	}



	
	
}
