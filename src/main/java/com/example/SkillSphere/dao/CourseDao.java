package com.example.SkillSphere.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SkillSphere.entity.Course;
@Repository
public class CourseDao {
	
	@Autowired
	CourseDaoImpl dao;
	
	public List<Course> getCourse()
	{
		
		return dao.findAll();
	
		
	}
	
	
	

}
