package com.dev.delta.pharmalife.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Buy {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  manufacturer_id;
	String  purchase_date;
	String  chalan_no;
	String  purchase_details;
	String  paytype;
	String  bank_id;
	
	public Buy() {
		// TODO Auto-generated constructor stub
	}

	public Buy(String manufacturer_id, String purchase_date, String chalan_no, String purchase_details, String paytype,
			String bank_id) {
		super();
		this.manufacturer_id = manufacturer_id;
		this.purchase_date = purchase_date;
		this.chalan_no = chalan_no;
		this.purchase_details = purchase_details;
		this.paytype = paytype;
		this.bank_id = bank_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(String manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getChalan_no() {
		return chalan_no;
	}

	public void setChalan_no(String chalan_no) {
		this.chalan_no = chalan_no;
	}

	public String getPurchase_details() {
		return purchase_details;
	}

	public void setPurchase_details(String purchase_details) {
		this.purchase_details = purchase_details;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	
	
}
