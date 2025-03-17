package com.example.SkillSphere.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String roadmap;
	
	private String duration;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, String roadmap, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.roadmap = roadmap;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoadmap() {
		return roadmap;
	}

	public void setRoadmap(String roadmap) {
		this.roadmap = roadmap;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	

}
