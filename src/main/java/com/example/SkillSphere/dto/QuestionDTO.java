package com.example.SkillSphere.dto;

import com.example.SkillSphere.entity.Answer;

import jakarta.persistence.OneToOne;

public class QuestionDTO {

	
	
	private String question;
	
	private String a;
	
	private String b;
	
	private String c;
	
	private String d;
	

	private String answer;
	
	
	private String quizTitle;


	public QuestionDTO(String question, String a, String b, String c, String d, String answer, String quizTitle) {
		super();
		this.question = question;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.answer = answer;

		this.quizTitle=quizTitle;
	}





	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getQuizTitle() {
		return quizTitle;
	}


	public void setQuizTitle(String quizTitle) {
		this.quizTitle = quizTitle;
	}
	
	
	
}
