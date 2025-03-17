package com.example.SkillSphere.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SkillSphere.entity.Questions;

public interface QuestionImpl extends JpaRepository<Questions, Integer> {

	List<Questions> findByQuiz_id(int id);

}
