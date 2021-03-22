package com.dev.delta.eventy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="eventy_userr")
public class UserEvent {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	 String username;
	  String  email;
	  String  password;
	  String  contact;
	public UserEvent() {
		// TODO Auto-generated constructor stub
	}
	public UserEvent(String username, String email, String password, String contact) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
