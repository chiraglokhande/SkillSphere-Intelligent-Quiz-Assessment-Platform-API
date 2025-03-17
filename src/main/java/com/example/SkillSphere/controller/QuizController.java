package com.example.SkillSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillSphere.dto.QuizDTO;
import com.example.SkillSphere.entity.Quiz;
import com.example.SkillSphere.service.QuizService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	QuizService service;

	@CrossOrigin(methods = RequestMethod.POST)
	@PostMapping("add-quiz")
	public boolean addQuiz(@RequestBody QuizDTO quiz)
	{
		
	
		return service.addQuiz(quiz);
		
	}
	
	@GetMapping("get-quiz")
	public List<Quiz> getQuiz()
	{
		
		
		return service.getQuiz();
		
	}
	
	
	@DeleteMapping("/delete-quiz/{title}")
	public String deleteQuiz(@PathVariable String title)
	{
		
		return service.deleteQuiz(title);
		
	}


}
