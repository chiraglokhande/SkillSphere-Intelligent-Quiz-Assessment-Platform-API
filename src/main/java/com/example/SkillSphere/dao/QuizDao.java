package com.example.SkillSphere.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SkillSphere.controller.AnswerController;
import com.example.SkillSphere.controller.QuestionController;
import com.example.SkillSphere.dto.QuizDTO;
import com.example.SkillSphere.entity.Quiz;

@Repository
public class QuizDao {
	
	@Autowired
	QuizDaoImpl impl;
	
	@Autowired
	QuestionController cont;
	
	@Autowired
	AnswerController ansCont;
	
	
	public boolean addQuiz(QuizDTO quiz)
	{
		boolean valid=false;
		
		if(quiz.getTitle()==null||quiz.getTitle().trim().isEmpty()) {
			
			for (Quiz quiz1 : getQuiz()) {
				if(quiz1.getTitle().equals(quiz.getTitle()))
				{
					valid= false;
				}
			}

		}
		else
		{
			impl.save(new Quiz(quiz.getTitle()));
			valid= true;
			
		}
		return valid;
		
	}
	
	public List<Quiz> getQuiz()
	{
		
		
		return impl.findAll();
		
	}

	public String deleteQuiz(String title) {
		Quiz quiz=impl.findByTitle(title);
		
		cont.deleteQuestionById(quiz.getId());
	
	
		impl.deleteByTitle(title);
		return "The Quiz Is Deleted Successfully..";
	}

}
