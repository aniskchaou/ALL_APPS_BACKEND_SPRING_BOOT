package com.dev.delta.lifecare.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   date;
	String    account_id;
	String    pay_to;
	String   description;
	String    amount;
	String   status;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(String date, String account_id, String pay_to, String description, String amount, String status) {
		super();
		this.date = date;
		this.account_id = account_id;
		this.pay_to = pay_to;
		this.description = description;
		this.amount = amount;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getPay_to() {
		return pay_to;
	}

	public void setPay_to(String pay_to) {
		this.pay_to = pay_to;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
