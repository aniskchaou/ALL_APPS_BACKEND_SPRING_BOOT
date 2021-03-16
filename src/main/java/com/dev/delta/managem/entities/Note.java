package com.dev.delta.managem.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Note {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  description;
	
	public Note() {
		// TODO Auto-generated constructor stub
	}

	public Note(String description) {
		super();
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
