package com.dev.delta.stockbay.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockbay_income")
public class IncomeStock {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    employee_fname;
	String    employee_email;
	String    employee_phone;
	String   employee_gender;
	String   employee_nid;
	String   status_id;
	String    employee_birthday;
	String    employee_address;
	String    employee_salary;
	
	public IncomeStock() {
		// TODO Auto-generated constructor stub
	}
	
	

	public IncomeStock(String employee_fname, String employee_email, String employee_phone, String employee_gender,
			String employee_nid, String status_id, String employee_birthday, String employee_address,
			String employee_salary) {
		super();
		this.employee_fname = employee_fname;
		this.employee_email = employee_email;
		this.employee_phone = employee_phone;
		this.employee_gender = employee_gender;
		this.employee_nid = employee_nid;
		this.status_id = status_id;
		this.employee_birthday = employee_birthday;
		this.employee_address = employee_address;
		this.employee_salary = employee_salary;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee_fname() {
		return employee_fname;
	}

	public void setEmployee_fname(String employee_fname) {
		this.employee_fname = employee_fname;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployee_phone() {
		return employee_phone;
	}

	public void setEmployee_phone(String employee_phone) {
		this.employee_phone = employee_phone;
	}

	public String getEmployee_gender() {
		return employee_gender;
	}

	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}

	public String getEmployee_nid() {
		return employee_nid;
	}

	public void setEmployee_nid(String employee_nid) {
		this.employee_nid = employee_nid;
	}

	public String getStatus_id() {
		return status_id;
	}

	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}

	public String getEmployee_birthday() {
		return employee_birthday;
	}

	public void setEmployee_birthday(String employee_birthday) {
		this.employee_birthday = employee_birthday;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	public String getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
}
