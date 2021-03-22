package com.dev.delta.dentic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dentic_prescription")
public class Prescription {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String prescription;
	
	public Prescription() {
		// TODO Auto-generated constructor stub
	}

	public Prescription(String prescription) {
		super();
		this.prescription = prescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	
	}
