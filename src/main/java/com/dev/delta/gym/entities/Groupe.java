package com.dev.delta.gym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="gym_groupe")
public class Groupe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	  Long id;
	String   groupe_name;
	
	public Groupe() {
		// TODO Auto-generated constructor stub
	}

	public Groupe(String groupe_name) {
		super();
		this.groupe_name = groupe_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupe_name() {
		return groupe_name;
	}

	public void setGroupe_name(String groupe_name) {
		this.groupe_name = groupe_name;
	}
	
	
}
