package com.dev.delta.fastbus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="fastbus_booking")
public class Booking {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    approximate_time;
	String       ftypes;
	String       route_id;
	String       adult;
	String       child_no;
	String       special;
	String       offer_code;
	String       price;
	String       discount;
	String       amount;
	String       passenger_email;
	String       pickup_location;
	String       drop_location;
	String       status;
	String       name;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(String approximate_time, String ftypes, String route_id, String adult, String child_no,
			String special, String offer_code, String price, String discount, String amount, String passenger_email,
			String pickup_location, String drop_location, String status, String name) {
		super();
		this.approximate_time = approximate_time;
		this.ftypes = ftypes;
		this.route_id = route_id;
		this.adult = adult;
		this.child_no = child_no;
		this.special = special;
		this.offer_code = offer_code;
		this.price = price;
		this.discount = discount;
		this.amount = amount;
		this.passenger_email = passenger_email;
		this.pickup_location = pickup_location;
		this.drop_location = drop_location;
		this.status = status;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApproximate_time() {
		return approximate_time;
	}

	public void setApproximate_time(String approximate_time) {
		this.approximate_time = approximate_time;
	}

	public String getFtypes() {
		return ftypes;
	}

	public void setFtypes(String ftypes) {
		this.ftypes = ftypes;
	}

	public String getRoute_id() {
		return route_id;
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	public String getAdult() {
		return adult;
	}

	public void setAdult(String adult) {
		this.adult = adult;
	}

	public String getChild_no() {
		return child_no;
	}

	public void setChild_no(String child_no) {
		this.child_no = child_no;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getOffer_code() {
		return offer_code;
	}

	public void setOffer_code(String offer_code) {
		this.offer_code = offer_code;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPassenger_email() {
		return passenger_email;
	}

	public void setPassenger_email(String passenger_email) {
		this.passenger_email = passenger_email;
	}

	public String getPickup_location() {
		return pickup_location;
	}

	public void setPickup_location(String pickup_location) {
		this.pickup_location = pickup_location;
	}

	public String getDrop_location() {
		return drop_location;
	}

	public void setDrop_location(String drop_location) {
		this.drop_location = drop_location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
