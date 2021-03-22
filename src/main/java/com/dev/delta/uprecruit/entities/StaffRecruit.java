package com.dev.delta.uprecruit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="uprecruit_staff")
public class StaffRecruit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   full_name;
	String     email;
	String     password;
	String     calling_code;
	String     role_id;
	
	public StaffRecruit() {
		// TODO Auto-generated constructor stub
	}

	public StaffRecruit(String full_name, String email, String password, String calling_code, String role_id) {
		super();
		this.full_name = full_name;
		this.email = email;
		this.password = password;
		this.calling_code = calling_code;
		this.role_id = role_id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCalling_code() {
		return calling_code;
	}

	public void setCalling_code(String calling_code) {
		this.calling_code = calling_code;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	
	
}
