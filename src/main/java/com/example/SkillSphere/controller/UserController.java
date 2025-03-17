package com.example.SkillSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillSphere.entity.User;
import com.example.SkillSphere.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;
	
	@CrossOrigin(methods = RequestMethod.POST)
	@PostMapping("/register")
    public String registerUser(@RequestBody User user) {
       
        return service.registerUser(user);
    }

@CrossOrigin(methods = RequestMethod.GET)
	@GetMapping("/get")
	public List<User> getUser() {

		return service.getUser();

	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@PostMapping("/login")
	public boolean loginUser(@RequestBody User user) {
		
		return service.loginUser(user.getUsername(), user.getPassword());

	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	

	@GetMapping("/getByUsername/{username}")
	public Object findByUsername(@PathVariable String username) {
        return service.findByUsername(username);
	}

	@CrossOrigin(methods = RequestMethod.DELETE)
	@DeleteMapping("/delete/{username}")
	public String deleteUser(@PathVariable String username)
	{

			return service.deleteUser(username);
		}

}
