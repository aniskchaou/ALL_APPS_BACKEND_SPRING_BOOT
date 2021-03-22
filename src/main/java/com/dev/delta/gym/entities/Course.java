package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_course")
public class Course {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String category;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String category) {
		super();
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
