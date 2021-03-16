package com.dev.delta.uprecruit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Skill {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String category_id;
	String  skills;
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public Skill(String category_id, String skills) {
		super();
		this.category_id = category_id;
		this.skills = skills;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
}
