package com.dev.delta.pharmalife.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pharmalife_supplier")
public class SupplierPharma {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  supplier_name;
	String   mobile;
	String   address;
	String   details;
	String   previous_balance;
	
	public SupplierPharma() {
		// TODO Auto-generated constructor stub
	}

	public SupplierPharma(String supplier_name, String mobile, String address, String details, String previous_balance) {
		super();
		this.supplier_name = supplier_name;
		this.mobile = mobile;
		this.address = address;
		this.details = details;
		this.previous_balance = previous_balance;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getPrevious_balance() {
		return previous_balance;
	}

	public void setPrevious_balance(String previous_balance) {
		this.previous_balance = previous_balance;
	}
	
	
}
