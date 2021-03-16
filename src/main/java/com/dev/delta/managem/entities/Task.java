package com.dev.delta.managem.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Task {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    project_id;
	String      description;
	String      title;
	String      due_date;
	String      priority;
	String      status;
	String     users;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(String project_id, String description, String title, String due_date, String priority, String status,
			String users) {
		super();
		this.project_id = project_id;
		this.description = description;
		this.title = title;
		this.due_date = due_date;
		this.priority = priority;
		this.status = status;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}
	
	
}
