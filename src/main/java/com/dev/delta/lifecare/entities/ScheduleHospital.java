package com.dev.delta.lifecare.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="lifecare_schedule")
public class ScheduleHospital {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   doctor_id;
	String   available_days;
	String   start_time;
	String   end_time;
	String   per_patient_time;
	String   serial_visibility_type;
	String    status;
	
	public ScheduleHospital() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleHospital(String doctor_id, String available_days, String start_time, String end_time,
			String per_patient_time, String serial_visibility_type, String status) {
		super();
		this.doctor_id = doctor_id;
		this.available_days = available_days;
		this.start_time = start_time;
		this.end_time = end_time;
		this.per_patient_time = per_patient_time;
		this.serial_visibility_type = serial_visibility_type;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getAvailable_days() {
		return available_days;
	}

	public void setAvailable_days(String available_days) {
		this.available_days = available_days;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getPer_patient_time() {
		return per_patient_time;
	}

	public void setPer_patient_time(String per_patient_time) {
		this.per_patient_time = per_patient_time;
	}

	public String getSerial_visibility_type() {
		return serial_visibility_type;
	}

	public void setSerial_visibility_type(String serial_visibility_type) {
		this.serial_visibility_type = serial_visibility_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
