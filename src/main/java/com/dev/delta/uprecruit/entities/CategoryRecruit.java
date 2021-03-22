package com.dev.delta.uprecruit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="uprecruit_category")
public class CategoryRecruit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String category;
	
	public CategoryRecruit() {
		// TODO Auto-generated constructor stub
	}

	public CategoryRecruit(String category) {
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
