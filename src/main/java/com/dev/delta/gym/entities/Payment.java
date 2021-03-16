package com.dev.delta.gym.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   type;
	String     member;
	String     amount;
	String     validity;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(String type, String member, String amount, String validity) {
		super();
		this.type = type;
		this.member = member;
		this.amount = amount;
		this.validity = validity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}
	
	
}
