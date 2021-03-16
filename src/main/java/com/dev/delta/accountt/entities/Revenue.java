package com.dev.delta.accountt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="revenue")
public class Revenue {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	 String date;
	 String amount;
	 String account_id;
	 String description;
	 String customer_id;
	 String category_id;
	 String reference;
	 
	 public Revenue() {
		// TODO Auto-generated constructor stub
	}

	public Revenue(String date, String amount, String account_id, String description, String customer_id,
			String category_id, String reference) {
		super();
		this.date = date;
		this.amount = amount;
		this.account_id = account_id;
		this.description = description;
		this.customer_id = customer_id;
		this.category_id = category_id;
		this.reference = reference;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	 
	 
}
