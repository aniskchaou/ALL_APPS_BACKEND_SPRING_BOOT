package com.dev.delta.eventy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="eventy_event")
public class Event {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String category_name;
    String event_name;
    String event_description;
    String event_start_date;
    
    public Event() {
		// TODO Auto-generated constructor stub
	}

	public Event(String category_name, String event_name, String event_description, String event_start_date) {
		super();
		this.category_name = category_name;
		this.event_name = event_name;
		this.event_description = event_description;
		this.event_start_date = event_start_date;
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

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_description() {
		return event_description;
	}

	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}

	public String getEvent_start_date() {
		return event_start_date;
	}

	public void setEvent_start_date(String event_start_date) {
		this.event_start_date = event_start_date;
	}
    
    
}
