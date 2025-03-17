package com.example.SkillSphere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.SkillSphere.entity.Quiz;

import jakarta.transaction.Transactional;

public interface QuizDaoImpl extends JpaRepository<Quiz, Integer> {

	 @Modifying
	 @Transactional
	void deleteByTitle(String title);

	Quiz findByTitle(String quizTitle);



}
