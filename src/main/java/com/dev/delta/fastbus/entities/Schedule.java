package com.dev.delta.fastbus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="fastbus_schedule")
public class Schedule {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   	start;
	String     end;
	String     duration;
	
	public Schedule() {
		// TODO Auto-generated constructor stub
	}

	public Schedule(String start, String end, String duration) {
		super();
		this.start = start;
		this.end = end;
		this.duration = duration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
