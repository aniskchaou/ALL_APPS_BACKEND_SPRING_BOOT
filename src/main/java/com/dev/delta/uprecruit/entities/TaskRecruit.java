package com.dev.delta.uprecruit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="uprecruit_task")
public class TaskRecruit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String title;
	
	public TaskRecruit() {
		// TODO Auto-generated constructor stub
	}

	public TaskRecruit(String title) {
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
