package com.example.SkillSphere.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SkillSphere.entity.Answer;

@Repository
public class AnswerDao {
	
	@Autowired
	AnswerDaoImpl impl;
	
	
	
	public void deleteAnswerById(int id)
	{
		
impl.deleteById(id);
	}
	
	public List<Answer> getAll(int id)
	{
		return impl.findByQuizId(id);
	}
	

	




}
