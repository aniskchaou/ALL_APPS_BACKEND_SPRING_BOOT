package com.dev.delta.pharmalife.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Constructor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  manufacturer_name;
	String   mobile;
	String    phone;
	String   fax;
	String   city;
	String   state;
	String   country;
	String   email;
	String   zip;
     String   previous_balance;
     
     public Constructor() {
		// TODO Auto-generated constructor stub
	}

	public Constructor(String manufacturer_name, String mobile, String phone, String fax, String city, String state,
			String country, String email, String zip, String previous_balance) {
		super();
		this.manufacturer_name = manufacturer_name;
		this.mobile = mobile;
		this.phone = phone;
		this.fax = fax;
		this.city = city;
		this.state = state;
		this.country = country;
		this.email = email;
		this.zip = zip;
		this.previous_balance = previous_balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
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

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPrevious_balance() {
		return previous_balance;
	}

	public void setPrevious_balance(String previous_balance) {
		this.previous_balance = previous_balance;
	}
     
}
