package com.example.SkillSphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillSphere.dao.CourseDao;
import com.example.SkillSphere.entity.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseDao dao;
	
	public List<Course> getCourse()
	{
		
		return dao.getCourse();
	
		
	}
	

}
