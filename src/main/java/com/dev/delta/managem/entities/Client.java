package com.dev.delta.managem.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Client {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  first_name;
	String   last_name;
	String   phone;
	String   password;
	String   email;
	String   company;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String first_name, String last_name, String phone, String password, String email, String company) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.password = password;
		this.email = email;
		this.company = company;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
