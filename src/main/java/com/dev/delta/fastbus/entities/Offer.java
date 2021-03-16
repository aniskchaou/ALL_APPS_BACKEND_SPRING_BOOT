package com.dev.delta.fastbus.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Offer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String     offer_name;
	String       offer_start_date;
	String       offer_end_date;
	String       offer_code;
	String       offer_discount;
	String       offer_terms;
	String       offer_route_id;
	String       offer_number;
	
	public Offer() {
		// TODO Auto-generated constructor stub
	}

	public Offer(String offer_name, String offer_start_date, String offer_end_date, String offer_code,
			String offer_discount, String offer_terms, String offer_route_id, String offer_number) {
		super();
		this.offer_name = offer_name;
		this.offer_start_date = offer_start_date;
		this.offer_end_date = offer_end_date;
		this.offer_code = offer_code;
		this.offer_discount = offer_discount;
		this.offer_terms = offer_terms;
		this.offer_route_id = offer_route_id;
		this.offer_number = offer_number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOffer_name() {
		return offer_name;
	}

	public void setOffer_name(String offer_name) {
		this.offer_name = offer_name;
	}

	public String getOffer_start_date() {
		return offer_start_date;
	}

	public void setOffer_start_date(String offer_start_date) {
		this.offer_start_date = offer_start_date;
	}

	public String getOffer_end_date() {
		return offer_end_date;
	}

	public void setOffer_end_date(String offer_end_date) {
		this.offer_end_date = offer_end_date;
	}

	public String getOffer_code() {
		return offer_code;
	}

	public void setOffer_code(String offer_code) {
		this.offer_code = offer_code;
	}

	public String getOffer_discount() {
		return offer_discount;
	}

	public void setOffer_discount(String offer_discount) {
		this.offer_discount = offer_discount;
	}

	public String getOffer_terms() {
		return offer_terms;
	}

	public void setOffer_terms(String offer_terms) {
		this.offer_terms = offer_terms;
	}

	public String getOffer_route_id() {
		return offer_route_id;
	}

	public void setOffer_route_id(String offer_route_id) {
		this.offer_route_id = offer_route_id;
	}

	public String getOffer_number() {
		return offer_number;
	}

	public void setOffer_number(String offer_number) {
		this.offer_number = offer_number;
	}
	
	
}
