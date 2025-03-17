package com.example.SkillSphere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SkillSphere.entity.User;

@Repository
public interface UserDaoImpl extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
