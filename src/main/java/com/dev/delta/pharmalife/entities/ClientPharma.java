package com.dev.delta.pharmalife.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pharmalife_client")
public class ClientPharma {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   customer_name;
	String   email;
	String   mobile;
	String   phone;
	String   city;
	String   zip;
	
	public ClientPharma() {
		// TODO Auto-generated constructor stub
	}

	public ClientPharma(String customer_name, String email, String mobile, String phone, String city, String zip) {
		super();
		this.customer_name = customer_name;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.city = city;
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
