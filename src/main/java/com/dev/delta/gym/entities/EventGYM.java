package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_event")
public class EventGYM {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  event_name;
	String     event_date;
	String     place_id;
	String     starttime;
	String     endtime;
	
	public EventGYM() {
		// TODO Auto-generated constructor stub
	}

	public EventGYM(String event_name, String event_date, String place_id, String starttime, String endtime) {
		super();
		this.event_name = event_name;
		this.event_date = event_date;
		this.place_id = place_id;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_date() {
		return event_date;
	}

	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	
}
