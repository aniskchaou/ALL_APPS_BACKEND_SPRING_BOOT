package com.dev.delta.uprecruit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="uprecruit_job")
public class Job {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  post;
	String     description;
	String     requirement;
	String     category;
	String    skill;
	String    start;
	String   end;
	String    state;
	String     location;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(String post, String description, String requirement, String category, String skill, String start,
			String end, String state, String location) {
		super();
		this.post = post;
		this.description = description;
		this.requirement = requirement;
		this.category = category;
		this.skill = skill;
		this.start = start;
		this.end = end;
		this.state = state;
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
