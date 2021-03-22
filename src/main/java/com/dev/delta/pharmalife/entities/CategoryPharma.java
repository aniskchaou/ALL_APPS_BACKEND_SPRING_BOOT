package com.dev.delta.pharmalife.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pharmalife_category")
public class CategoryPharma {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   category_name;
	
	
	public CategoryPharma() {
		// TODO Auto-generated constructor stub
	}


	public CategoryPharma(String category_name) {
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
