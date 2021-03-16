package com.dev.delta.uprecruit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String category;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String category) {
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
