package com.dev.delta.accountt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="supplier")
public class Supplier {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	 String name;
	 String email;
	 String phone;
	 String billing_country;
	 String billing_city;
	 String billing_zip;
	 String shipping_country;
	 String shipping_city;
	 String shipping_zip;
	 
	 public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(String name, String email, String phone, String billing_country, String billing_city,
			String billing_zip, String shipping_country, String shipping_city, String shipping_zip) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.billing_country = billing_country;
		this.billing_city = billing_city;
		this.billing_zip = billing_zip;
		this.shipping_country = shipping_country;
		this.shipping_city = shipping_city;
		this.shipping_zip = shipping_zip;
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

	public String getBilling_country() {
		return billing_country;
	}

	public void setBilling_country(String billing_country) {
		this.billing_country = billing_country;
	}

	public String getBilling_city() {
		return billing_city;
	}

	public void setBilling_city(String billing_city) {
		this.billing_city = billing_city;
	}

	public String getBilling_zip() {
		return billing_zip;
	}

	public void setBilling_zip(String billing_zip) {
		this.billing_zip = billing_zip;
	}

	public String getShipping_country() {
		return shipping_country;
	}

	public void setShipping_country(String shipping_country) {
		this.shipping_country = shipping_country;
	}

	public String getShipping_city() {
		return shipping_city;
	}

	public void setShipping_city(String shipping_city) {
		this.shipping_city = shipping_city;
	}

	public String getShipping_zip() {
		return shipping_zip;
	}

	public void setShipping_zip(String shipping_zip) {
		this.shipping_zip = shipping_zip;
	}
	 
	 
}
