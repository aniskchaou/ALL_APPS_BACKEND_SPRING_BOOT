package com.dev.delta.librarylab.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String category_name;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String category_name) {
		super();
		this.category_name = category_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	
}
