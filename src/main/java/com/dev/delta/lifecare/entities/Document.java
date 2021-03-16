package com.dev.delta.lifecare.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Document {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    doctor_id;
	String    patient_id;
	String    description;
	
	
	public Document() {
		// TODO Auto-generated constructor stub
	}


	public Document(String doctor_id, String patient_id, String description) {
		super();
		this.doctor_id = doctor_id;
		this.patient_id = patient_id;
		this.description = description;
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


	public String getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
