package com.dev.delta.pharmalife.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pharmalife_medicament")
public class MedicamentPharma {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   product_name;
	String   generic_name;
      String    box_size;
      String    unit;
      String   product_location;
      String    description;
      String    type_name;
      String   category_id;
      String   price;
      String  tax;
      String   manufacturer_id;
      String   manufacturer_price;
      
      public MedicamentPharma() {
		// TODO Auto-generated constructor stub
	}

	public MedicamentPharma(String product_name, String generic_name, String box_size, String unit, String product_location,
			String description, String type_name, String category_id, String price, String tax, String manufacturer_id,
			String manufacturer_price) {
		super();
		this.product_name = product_name;
		this.generic_name = generic_name;
		this.box_size = box_size;
		this.unit = unit;
		this.product_location = product_location;
		this.description = description;
		this.type_name = type_name;
		this.category_id = category_id;
		this.price = price;
		this.tax = tax;
		this.manufacturer_id = manufacturer_id;
		this.manufacturer_price = manufacturer_price;
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

	public String getGeneric_name() {
		return generic_name;
	}

	public void setGeneric_name(String generic_name) {
		this.generic_name = generic_name;
	}

	public String getBox_size() {
		return box_size;
	}

	public void setBox_size(String box_size) {
		this.box_size = box_size;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getProduct_location() {
		return product_location;
	}

	public void setProduct_location(String product_location) {
		this.product_location = product_location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(String manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}

	public String getManufacturer_price() {
		return manufacturer_price;
	}

	public void setManufacturer_price(String manufacturer_price) {
		this.manufacturer_price = manufacturer_price;
	}
      
      
}
