package com.example.SkillSphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillSphere.dao.QuizDao;
import com.example.SkillSphere.dto.QuizDTO;
import com.example.SkillSphere.entity.Quiz;

@Service
public class QuizService {
	
	@Autowired
	QuizDao dao;
	

	public boolean addQuiz(QuizDTO quiz)
	{

		
			return dao.addQuiz(quiz);
		}
	
	
	public List<Quiz> getQuiz()
	{
		
		
		return dao.getQuiz();
		
	}


	public String deleteQuiz(String title) {
		
		return dao.deleteQuiz(title);
	}


}
