package com.dev.delta.uprecruit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ApplyJob {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String full_name;
	String     email;
	String     phone;
	String     cover_letter;
	
	public ApplyJob() {
		// TODO Auto-generated constructor stub
	}

	public ApplyJob(String full_name, String email, String phone, String cover_letter) {
		super();
		this.full_name = full_name;
		this.email = email;
		this.phone = phone;
		this.cover_letter = cover_letter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCover_letter() {
		return cover_letter;
	}

	public void setCover_letter(String cover_letter) {
		this.cover_letter = cover_letter;
	}
	
	
}
