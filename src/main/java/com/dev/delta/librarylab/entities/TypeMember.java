package com.dev.delta.librarylab.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="librarylab_type_member")
public class TypeMember {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String member_type_name;
	
	public TypeMember() {
		// TODO Auto-generated constructor stub
	}

	public TypeMember(String member_type_name) {
		super();
		this.member_type_name = member_type_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMember_type_name() {
		return member_type_name;
	}

	public void setMember_type_name(String member_type_name) {
		this.member_type_name = member_type_name;
	}
	
	
}
