package com.example.SkillSphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillSphere.service.AnswerService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/answer")
public class AnswerController {

	@Autowired
	AnswerService service;
	

	public void deleteAnswerById(int id)
	{
		service.deleteAnswerById(id);
	}

}
