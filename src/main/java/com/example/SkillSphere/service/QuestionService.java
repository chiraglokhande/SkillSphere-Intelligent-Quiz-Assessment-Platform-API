package com.example.SkillSphere.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillSphere.dao.AnswerDao;
import com.example.SkillSphere.dao.AnswerDaoImpl;
import com.example.SkillSphere.dao.QuestionDao;
import com.example.SkillSphere.dao.QuizDaoImpl;
import com.example.SkillSphere.dto.QuestionDTO;
import com.example.SkillSphere.entity.Answer;
import com.example.SkillSphere.entity.Questions;
import com.example.SkillSphere.entity.Quiz;

@Service
public class QuestionService {

	@Autowired
	QuestionDao dao;

	@Autowired
	AnswerDao impl;

	@Autowired
	QuizDaoImpl quizImpl;

	String title;

	public String addQuestion(Questions question) {

		return dao.addQuestion(question);
	}

	public List<Questions> getQuestion() {
		return dao.getQuestion();

	}

	public void deleteQuestionById(Questions question) {

		dao.deleteQuestionById(question);

	}

	public List<Questions> getByQuizTitle(String title) {
		int id = 0;
		this.title = title;
		for (Questions question : getQuestion()) {

			if (question.getQuiz().getTitle().equals(title)) {
				id = question.getQuiz().getId();
			}

		}
		return dao.getQuestionByQuizTitle(id);

	}

	public int calculateMarks(String s[]) {
		int marks = 0;
		int quizId = 0;
		List<Questions> que = getQuestion();
		// Validate input
		if (s == null || s.length == 0) {
			return 0; // No answers provided
		}

		// Fetch quiz questions

		if (que == null || que.isEmpty()) {
			return 1; // No quiz found
		}

		// Get quiz ID from the first question
		for (Questions questions : que) {
			if (questions.getQuiz().getTitle().equals(title)) {
				quizId = questions.getQuiz().getId();
			}
		}

		// Fetch answers for this quiz
		List<Answer> ans = impl.getAll(quizId);
		if (ans == null || ans.isEmpty()) {
			return 10;
		}
		// Prevent index out of bounds exception
		int minSize = Math.min(ans.size(), s.length);

		for (int i = 0; i < minSize; i++) {
			if (ans.get(i).getAns().equals(s[i])) {
				marks++;
			}
		}

		return marks; // ✅ Return calculated marks, not s.length
	}
	
	public String updateQuestion(List<Questions> question)
	{

		return dao.updateQuestion(question);
		
	}

}
