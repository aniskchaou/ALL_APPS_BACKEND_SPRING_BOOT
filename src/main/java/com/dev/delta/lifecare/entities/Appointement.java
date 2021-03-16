package com.dev.delta.lifecare.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Appointement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  departement_id;
	String    patient_id;
	String   doctor_id;
	String   date;
	String   problem;
	String   status;
	public Appointement(String departement_id, String patient_id, String doctor_id, String date, String problem,
			String status) {
		super();
		this.departement_id = departement_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.date = date;
		this.problem = problem;
		this.status = status;
	}
	
	public Appointement() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartement_id() {
		return departement_id;
	}

	public void setDepartement_id(String departement_id) {
		this.departement_id = departement_id;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
