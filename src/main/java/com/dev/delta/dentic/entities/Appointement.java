package com.dev.delta.dentic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="appointement")
public class Appointement {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String date;
	String    patient;
	String    problem;
	String    venue;
	
	public Appointement() {
		// TODO Auto-generated constructor stub
	}

	public Appointement(String date, String patient, String problem, String venue) {
		super();
		this.date = date;
		this.patient = patient;
		this.problem = problem;
		this.venue = venue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	
}
