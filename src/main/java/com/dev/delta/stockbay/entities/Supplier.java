package com.dev.delta.stockbay.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Supplier {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String     supplier_name;
	String     supplier_phone;
	String     supplier_email;
	String     supplier_company;
	String     supplier_address;
	String     status_id;
	String     supplier_description;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(String supplier_name, String supplier_phone, String supplier_email, String supplier_company,
			String supplier_address, String status_id, String supplier_description) {
		super();
		this.supplier_name = supplier_name;
		this.supplier_phone = supplier_phone;
		this.supplier_email = supplier_email;
		this.supplier_company = supplier_company;
		this.supplier_address = supplier_address;
		this.status_id = status_id;
		this.supplier_description = supplier_description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getSupplier_phone() {
		return supplier_phone;
	}

	public void setSupplier_phone(String supplier_phone) {
		this.supplier_phone = supplier_phone;
	}

	public String getSupplier_email() {
		return supplier_email;
	}

	public void setSupplier_email(String supplier_email) {
		this.supplier_email = supplier_email;
	}

	public String getSupplier_company() {
		return supplier_company;
	}

	public void setSupplier_company(String supplier_company) {
		this.supplier_company = supplier_company;
	}

	public String getSupplier_address() {
		return supplier_address;
	}

	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}

	public String getStatus_id() {
		return status_id;
	}

	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}

	public String getSupplier_description() {
		return supplier_description;
	}

	public void setSupplier_description(String supplier_description) {
		this.supplier_description = supplier_description;
	}
	
	
}
