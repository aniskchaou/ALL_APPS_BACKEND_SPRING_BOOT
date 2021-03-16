package com.dev.delta.fastbus.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Destination {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    name;
	String       description;
	
	public Destination() {
		// TODO Auto-generated constructor stub
	}

	public Destination(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
