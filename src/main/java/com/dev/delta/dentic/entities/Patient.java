package com.dev.delta.dentic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String    patient_id;
	String    venue;
	String    phone;
	String    blood_group;
	String    address;
	String    email;
	String    date;
	String    old;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient( String name, String patient_id, String venue, String phone, String blood_group,
			String address, String email, String date, String old) {
		super();
	
		this.name = name;
		this.patient_id = patient_id;
		this.venue = venue;
		this.phone = phone;
		this.blood_group = blood_group;
		this.address = address;
		this.email = email;
		this.date = date;
		this.old = old;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOld() {
		return old;
	}

	public void setOld(String old) {
		this.old = old;
	}
	
	
}
