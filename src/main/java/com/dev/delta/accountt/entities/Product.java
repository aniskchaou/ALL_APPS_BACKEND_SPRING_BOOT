package com.dev.delta.accountt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id;
	 String name;
	 String description;
	 String sale_price;
	 String purchase_price;
	 String tax_id;
	 String category_id;
	 String unit_id;
	 String type;
	 
	 
	 public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String name, String description, String sale_price, String purchase_price, String tax_id,
			String category_id, String unit_id, String type) {
		super();
		this.name = name;
		this.description = description;
		this.sale_price = sale_price;
		this.purchase_price = purchase_price;
		this.tax_id = tax_id;
		this.category_id = category_id;
		this.unit_id = unit_id;
		this.type = type;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getSale_price() {
		return sale_price;
	}


	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}


	public String getPurchase_price() {
		return purchase_price;
	}


	public void setPurchase_price(String purchase_price) {
		this.purchase_price = purchase_price;
	}


	public String getTax_id() {
		return tax_id;
	}


	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}


	public String getCategory_id() {
		return category_id;
	}


	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}


	public String getUnit_id() {
		return unit_id;
	}


	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	 
	
}
