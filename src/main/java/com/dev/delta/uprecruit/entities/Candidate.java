package com.dev.delta.uprecruit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Candidate {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String post;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(String post) {
		super();
		this.post = post;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
	
}
