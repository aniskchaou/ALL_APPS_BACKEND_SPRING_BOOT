package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_type_sub")
public class TypeSub {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  member;
	String    category;
	String     period;
	String     timeLimit;
	String     amount;
	String    description;
	String    fee;
	String    time_payment;
	
	public TypeSub() {
		// TODO Auto-generated constructor stub
	}

	public TypeSub(String member, String category, String period, String limit, String amount, String description,
			String fee, String time_payment) {
		super();
		this.member = member;
		this.category = category;
		this.period = period;
		this.timeLimit = limit;
		this.amount = amount;
		this.description = description;
		this.fee = fee;
		this.time_payment = time_payment;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getLimit() {
		return timeLimit;
	}

	public void setLimit(String limit) {
		this.timeLimit = limit;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getTime_payment() {
		return time_payment;
	}

	public void setTime_payment(String time_payment) {
		this.time_payment = time_payment;
	}
	
	
}
