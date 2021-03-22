package com.dev.delta.managem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="managem_my_task")
public class MyTask {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   todo;
	String      due_date;
	
	public MyTask() {
		// TODO Auto-generated constructor stub
	}

	public MyTask(String todo, String due_date) {
		super();
		this.todo = todo;
		this.due_date = due_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	
	
}
