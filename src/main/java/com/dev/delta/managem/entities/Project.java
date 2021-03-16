package com.dev.delta.managem.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Project {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   title;
	String      description;
	String      starting_date;
	String      ending_date;
	String      users;
	String      client;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(String title, String description, String starting_date, String ending_date, String users,
			String client) {
		super();
		this.title = title;
		this.description = description;
		this.starting_date = starting_date;
		this.ending_date = ending_date;
		this.users = users;
		this.client = client;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStarting_date() {
		return starting_date;
	}

	public void setStarting_date(String starting_date) {
		this.starting_date = starting_date;
	}

	public String getEnding_date() {
		return ending_date;
	}

	public void setEnding_date(String ending_date) {
		this.ending_date = ending_date;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	
	
	
}
