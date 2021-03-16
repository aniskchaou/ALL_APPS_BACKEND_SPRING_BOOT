package com.dev.delta.gym.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Revenue {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   member;
	String     type;
	String     amount;
	String    revenue;
	String    date;
	
	public Revenue() {
		// TODO Auto-generated constructor stub
	}

	public Revenue(String member, String type, String amount, String revenue, String date) {
		super();
		this.member = member;
		this.type = type;
		this.amount = amount;
		this.revenue = revenue;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
