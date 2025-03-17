package com.example.SkillSphere.entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private String username;
	
	private String firstName;
	private String lastName;

	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String firstName, String lastName, String username, String password) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
