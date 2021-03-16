package com.dev.delta.fastbus.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Travel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    types;
	String       route;
	String       trip_title;
	String       shedule;
	String       status;
	String       weekend;
	
	public Travel() {
		// TODO Auto-generated constructor stub
	}

	public Travel(String types, String route, String trip_title, String shedule, String status, String weekend) {
		super();
		this.types = types;
		this.route = route;
		this.trip_title = trip_title;
		this.shedule = shedule;
		this.status = status;
		this.weekend = weekend;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getTrip_title() {
		return trip_title;
	}

	public void setTrip_title(String trip_title) {
		this.trip_title = trip_title;
	}

	public String getShedule() {
		return shedule;
	}

	public void setShedule(String shedule) {
		this.shedule = shedule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWeekend() {
		return weekend;
	}

	public void setWeekend(String weekend) {
		this.weekend = weekend;
	}
	
	
	
}
