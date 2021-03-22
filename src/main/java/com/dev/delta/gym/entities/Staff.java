package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_staff")
public class Staff {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   date;
	String     role;
	String     address;
	String     email;
	String     mobile;
	String    first_name;
	String   last_name;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String date, String role, String address, String email, String mobile, String first_name,
			String last_name) {
		super();
		this.date = date;
		this.role = role;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.first_name = first_name;
		this.last_name = last_name;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
}
