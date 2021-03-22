package com.dev.delta.fastbus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="fastbus_assign")
public class Assign {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String trip;
	String  fleet_registration_id;
	String   assign_date;
	String driver_id;
	String assistant_1;
	String  assistant_2;
	String assistant_3;
	String  status;
	
	public Assign() {
		// TODO Auto-generated constructor stub
	}

	public Assign(String trip, String fleet_registration_id, String assign_date, String driver_id, String assistant_1,
			String assistant_2, String assistant_3, String status) {
		super();
		this.trip = trip;
		this.fleet_registration_id = fleet_registration_id;
		this.assign_date = assign_date;
		this.driver_id = driver_id;
		this.assistant_1 = assistant_1;
		this.assistant_2 = assistant_2;
		this.assistant_3 = assistant_3;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public String getFleet_registration_id() {
		return fleet_registration_id;
	}

	public void setFleet_registration_id(String fleet_registration_id) {
		this.fleet_registration_id = fleet_registration_id;
	}

	public String getAssign_date() {
		return assign_date;
	}

	public void setAssign_date(String assign_date) {
		this.assign_date = assign_date;
	}

	public String getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}

	public String getAssistant_1() {
		return assistant_1;
	}

	public void setAssistant_1(String assistant_1) {
		this.assistant_1 = assistant_1;
	}

	public String getAssistant_2() {
		return assistant_2;
	}

	public void setAssistant_2(String assistant_2) {
		this.assistant_2 = assistant_2;
	}

	public String getAssistant_3() {
		return assistant_3;
	}

	public void setAssistant_3(String assistant_3) {
		this.assistant_3 = assistant_3;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
