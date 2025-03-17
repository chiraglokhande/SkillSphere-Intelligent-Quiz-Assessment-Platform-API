package com.example.SkillSphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillSphere.dao.AnswerDao;
import com.example.SkillSphere.entity.Answer;

@Service
public class AnswerService {
	
	@Autowired
	AnswerDao dao;
	
	
	public void deleteAnswerById(int id)
	{
		dao.deleteAnswerById(id);
	}
	
	

}
