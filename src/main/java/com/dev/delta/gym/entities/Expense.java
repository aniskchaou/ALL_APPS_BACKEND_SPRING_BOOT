package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_expense")
public class Expense {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  date;
	String     supplier;
	String     amount;
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}

	public Expense(String date, String supplier, String amount) {
		super();
		this.date = date;
		this.supplier = supplier;
		this.amount = amount;
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

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
