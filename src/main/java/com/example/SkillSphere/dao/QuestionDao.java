package com.example.SkillSphere.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SkillSphere.dto.QuestionDTO;
import com.example.SkillSphere.entity.Answer;
import com.example.SkillSphere.entity.Questions;
import com.example.SkillSphere.entity.Quiz;

@Repository
public class QuestionDao {
	
	
	@Autowired
	QuestionImpl impl;
	
	
	public String addQuestion(Questions question)
	{
	
		impl.save(question);
		return"Question is Added";
	}


	public List<Questions> getQuestion() {

		return impl.findAll();
	}


	public void deleteQuestionById(Questions question) {
		
		impl.delete(question);
		
	}
	
	public List<Questions> getQuestionByQuizTitle(int id)
	{
		
		
		return impl.findByQuiz_id(id);
		
	}
	
	public String updateQuestion(List<Questions> question)
	{
		for (Questions questions : question) {
			impl.save(questions);
		}
		
		return "Question is Updated..";
		
	}
	

}
