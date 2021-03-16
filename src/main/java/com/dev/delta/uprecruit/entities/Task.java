package com.dev.delta.uprecruit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Task {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String title;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(String title) {
		super();
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
