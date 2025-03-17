package com.example.SkillSphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SkillSphere.dao.UserDao;
import com.example.SkillSphere.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public String registerUser(User user) {
	    // Check if the user already exists
	    if (dao.findByUsername(user.getUsername()) != null) {
	        return "Already Exists";
	    }

	    // Register the user if not exists
	    dao.registerUser(user);
	    return "Successfully Registered";
	}


	public List<User> getUser() {

		return dao.getUser();

	}

	public boolean loginUser(String username, String password) {
	    for (User user : dao.getUser()) {
	        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	            return true; 
	        }
	    }
	    return false; 
	}
	
	public String updateUser(@RequestBody User user)
	{
		return dao.updateUser(user);
	}
	
	public Object findByUsername(String username) {
        return dao.findByUsername(username);
	}
	
	public String deleteUser(String username)
	{

		
			return dao.deleteUser(username);
		}

	}




