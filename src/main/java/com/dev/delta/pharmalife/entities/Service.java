package com.dev.delta.pharmalife.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Service {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  service_name;
	String  charge;
	String  description;
	String   tax;
	
	public Service() {
		// TODO Auto-generated constructor stub
	}

	public Service(String service_name, String charge, String description, String tax) {
		super();
		this.service_name = service_name;
		this.charge = charge;
		this.description = description;
		this.tax = tax;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}
	
	
}
