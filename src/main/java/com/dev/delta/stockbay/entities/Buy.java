package com.dev.delta.stockbay.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Buy {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  supplier;
	String    product_id;
	String    purchase_date;
	String    purchase_invoiceNo;
	String    purchase_status;
	
	public Buy() {
		// TODO Auto-generated constructor stub
	}

	public Buy(String supplier, String product_id, String purchase_date, String purchase_invoiceNo,
			String purchase_status) {
		super();
		this.supplier = supplier;
		this.product_id = product_id;
		this.purchase_date = purchase_date;
		this.purchase_invoiceNo = purchase_invoiceNo;
		this.purchase_status = purchase_status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getPurchase_invoiceNo() {
		return purchase_invoiceNo;
	}

	public void setPurchase_invoiceNo(String purchase_invoiceNo) {
		this.purchase_invoiceNo = purchase_invoiceNo;
	}

	public String getPurchase_status() {
		return purchase_status;
	}

	public void setPurchase_status(String purchase_status) {
		this.purchase_status = purchase_status;
	}
	
	
}
