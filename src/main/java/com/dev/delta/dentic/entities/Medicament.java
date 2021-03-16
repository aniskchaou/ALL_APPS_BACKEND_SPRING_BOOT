package com.dev.delta.dentic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="medicament")
public class Medicament {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String medicine_name;
	String    company_name;
	String    group_name;
	String    description;
	
	public Medicament() {
		// TODO Auto-generated constructor stub
	}

	public Medicament(Long id, String medicine_name, String company_name, String group_name, String description) {
		super();
		this.id = id;
		this.medicine_name = medicine_name;
		this.company_name = company_name;
		this.group_name = group_name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
