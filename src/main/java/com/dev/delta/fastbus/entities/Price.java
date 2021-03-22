package com.dev.delta.fastbus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fastbus_price")
public class Price {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   route_id;
	String    vehicle_type_id;
	String     price;
	String    childere_price;
	String    special_price;
	String    group_price_per_person;
	
	public Price() {
		// TODO Auto-generated constructor stub
	}

	public Price(String route_id, String vehicle_type_id, String price, String childere_price, String special_price,
			String group_price_per_person) {
		super();
		this.route_id = route_id;
		this.vehicle_type_id = vehicle_type_id;
		this.price = price;
		this.childere_price = childere_price;
		this.special_price = special_price;
		this.group_price_per_person = group_price_per_person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoute_id() {
		return route_id;
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	public String getVehicle_type_id() {
		return vehicle_type_id;
	}

	public void setVehicle_type_id(String vehicle_type_id) {
		this.vehicle_type_id = vehicle_type_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getChildere_price() {
		return childere_price;
	}

	public void setChildere_price(String childere_price) {
		this.childere_price = childere_price;
	}

	public String getSpecial_price() {
		return special_price;
	}

	public void setSpecial_price(String special_price) {
		this.special_price = special_price;
	}

	public String getGroup_price_per_person() {
		return group_price_per_person;
	}

	public void setGroup_price_per_person(String group_price_per_person) {
		this.group_price_per_person = group_price_per_person;
	}
	
	
}
