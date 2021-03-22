package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_activity")
public class Activity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   category;
	String     title;
	String     member;
	String     type;
	
	
	public Activity() {
		// TODO Auto-generated constructor stub
	}


	public Activity(String category, String title, String member, String type) {
		super();
		this.category = category;
		this.title = title;
		this.member = member;
		this.type = type;
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMember() {
		return member;
	}


	public void setMember(String member) {
		this.member = member;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
}
