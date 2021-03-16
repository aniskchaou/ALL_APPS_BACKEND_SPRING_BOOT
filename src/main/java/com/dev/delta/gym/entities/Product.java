package com.dev.delta.gym.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  product_name;
	String     price;
	String     quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String product_name, String price, String quantity) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
}
