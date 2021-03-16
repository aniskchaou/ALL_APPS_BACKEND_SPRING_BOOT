package com.dev.delta.lifecare.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Doctor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   firstname;
	String    lastname;
	String    email;
	String   password;
	String   designation;
	String   address;
	String    departement_id;
	String   phone;
	String   mobile;
	String   specialist;
	String    date_of_birth;
	String    sex;
	String   blood_group;
	String   status;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String firstname, String lastname, String email, String password, String designation, String address,
			String departement_id, String phone, String mobile, String specialist, String date_of_birth, String sex,
			String blood_group, String status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.address = address;
		this.departement_id = departement_id;
		this.phone = phone;
		this.mobile = mobile;
		this.specialist = specialist;
		this.date_of_birth = date_of_birth;
		this.sex = sex;
		this.blood_group = blood_group;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartement_id() {
		return departement_id;
	}

	public void setDepartement_id(String departement_id) {
		this.departement_id = departement_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
