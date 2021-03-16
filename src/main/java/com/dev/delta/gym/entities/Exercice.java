package com.dev.delta.gym.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Exercice {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   member_id;
	String    record_date;
	
	public Exercice() {
		// TODO Auto-generated constructor stub
	}

	public Exercice(String member_id, String record_date) {
		super();
		this.member_id = member_id;
		this.record_date = record_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getRecord_date() {
		return record_date;
	}

	public void setRecord_date(String record_date) {
		this.record_date = record_date;
	}
	
	
}
