package com.example.SkillSphere.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SkillSphere.entity.Answer;

public interface AnswerDaoImpl extends JpaRepository<Answer, Integer>{

	List<Answer> findByQuizId(int quiz_id);

}
