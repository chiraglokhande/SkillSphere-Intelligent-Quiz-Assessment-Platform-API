package com.example.SkillSphere.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SkillSphere.entity.Course;
import com.example.SkillSphere.entity.User;

@Repository
public class UserDao {

	@Autowired
	UserDaoImpl impl;

	public String registerUser(User user) {

		impl.save(user);
		return "Successfully Registered!!";
	}

	public List<User> getUser() {

		return impl.findAll();

	}

	public User findByUsername(String username) {
		return impl.findByUsername(username);
	}

	public String updateUser(User user) {
		User existingUser = findByUsername(user.getUsername());

		if (existingUser != null) {
			impl.save(user);
			return "User Updated Successfully..";
		} else {
			return "User Not Found..";
		}

	}
	
	public String deleteUser(String username)
	{
		User existingUser = findByUsername(username);

		if (existingUser != null) {
			impl.delete(existingUser);
			return "User Deleted Successfully..";
		} else {
			return "User Not Found..";
		}

	}

}
