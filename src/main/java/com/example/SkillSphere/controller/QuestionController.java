package com.example.SkillSphere.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillSphere.dao.AnswerDaoImpl;
import com.example.SkillSphere.dao.QuizDaoImpl;
import com.example.SkillSphere.dto.QuestionDTO;
import com.example.SkillSphere.entity.Answer;
import com.example.SkillSphere.entity.Questions;
import com.example.SkillSphere.entity.Quiz;
import com.example.SkillSphere.service.QuestionService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService service;

	@Autowired
	AnswerDaoImpl impl;

	@Autowired
	QuizDaoImpl quiz;

	@Autowired
	AnswerController controller;

	@PostMapping("/add-question")
	public String addQuestion(@RequestBody QuestionDTO question) {
		Questions question1 = new Questions();

		Quiz quizObj = quiz.findByTitle(question.getQuizTitle());

		if (quizObj == null) {
			return "Quiz is NULL";
		}

		Answer answer = new Answer();
		
		answer.setQuizId(quizObj.getId());
		answer.setAns(question.getAnswer());
		impl.save(answer);

		question1.setAnswer(answer);
		question1.setQuiz(quizObj);
		question1.setQuestion(question.getQuestion());
		question1.setA(question.getA());
		question1.setB(question.getB());

		question1.setC(question.getC());
		question1.setD(question.getD());

		return service.addQuestion(question1);

	}

	@GetMapping("/get-questions")
	public List<Questions> getQuestion() {
		return service.getQuestion();

	}

	public void deleteQuestionById(int id) {

		for (Questions question : getQuestion()) {

			if (question.getQuiz().getId() == id) {

				service.deleteQuestionById(question);
				controller.deleteAnswerById(question.getAnswer().getId());
			}
		}

	}

	@GetMapping("/get-questionsByQuizTitle/{title}")
	public List<Questions> getQuestionByQuizTitle(@PathVariable String title) {

		return service.getByQuizTitle(title);

	}

	@PostMapping("/check-marks")
	public int calculateMarks(@RequestBody String s[]) {
		return service.calculateMarks(s);

	}
	
	@PutMapping("/update-questions")
	public String updateQuestion(@RequestBody List<Questions> question)
	{

	
		return service.updateQuestion(question);
		
	}
	
	
	
	

}
