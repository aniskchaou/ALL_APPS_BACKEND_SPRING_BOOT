package com.dev.delta.stockbay.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockbay_category")
public class CategoryStock {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   category_name;
	String   status_id;
	String   category_details;
	
	public CategoryStock() {
		// TODO Auto-generated constructor stub
	}

	public CategoryStock(String category_name, String status_id, String category_details) {
		super();
		this.category_name = category_name;
		this.status_id = status_id;
		this.category_details = category_details;
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

	public String getStatus_id() {
		return status_id;
	}

	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}

	public String getCategory_details() {
		return category_details;
	}

	public void setCategory_details(String category_details) {
		this.category_details = category_details;
	}
	
	
}
