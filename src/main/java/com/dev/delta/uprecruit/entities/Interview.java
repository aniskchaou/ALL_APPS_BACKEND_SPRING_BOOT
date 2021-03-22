package com.dev.delta.uprecruit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="uprecruit_interview")
public class Interview {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String candidates;
	String   employees;
	String    scheduleDate;
	String    scheduleTime;
	String    comment;
	
	public Interview() {
		// TODO Auto-generated constructor stub
	}

	public Interview(String candidates, String employees, String scheduleDate, String scheduleTime, String comment) {
		super();
		this.candidates = candidates;
		this.employees = employees;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCandidates() {
		return candidates;
	}

	public void setCandidates(String candidates) {
		this.candidates = candidates;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
