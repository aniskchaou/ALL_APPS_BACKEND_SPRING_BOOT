package com.dev.delta.librarylab.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Member {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String user_type;
	String  type_id;
	String email;
	String mobile;
	String password;
	String address;
	String status;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String user_type, String type_id, String email, String mobile, String password,
			String address, String status) {
		super();
		this.name = name;
		this.user_type = user_type;
		this.type_id = type_id;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.address = address;
		this.status = status;
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

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
