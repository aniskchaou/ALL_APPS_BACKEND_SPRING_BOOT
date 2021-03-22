package com.dev.delta.stockbay.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockbay_product")
public class ProductStock {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    product_name;
	String    category_id;
	String    supplier_id;
	String    product_unit;
	String    product_alertquantity;
	String    product_supplierPrice;
	String    product_sellPrice;
	String    product_code;
	String    product_tax;
	String    warehouse_id;
	String    product_details;
	String    product_detailsforinvoice;
	
	public ProductStock() {
		// TODO Auto-generated constructor stub
	}

	public ProductStock(String product_name, String category_id, String supplier_id, String product_unit,
			String product_alertquantity, String product_supplierPrice, String product_sellPrice, String product_code,
			String product_tax, String warehouse_id, String product_details, String product_detailsforinvoice) {
		super();
		this.product_name = product_name;
		this.category_id = category_id;
		this.supplier_id = supplier_id;
		this.product_unit = product_unit;
		this.product_alertquantity = product_alertquantity;
		this.product_supplierPrice = product_supplierPrice;
		this.product_sellPrice = product_sellPrice;
		this.product_code = product_code;
		this.product_tax = product_tax;
		this.warehouse_id = warehouse_id;
		this.product_details = product_details;
		this.product_detailsforinvoice = product_detailsforinvoice;
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

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getProduct_unit() {
		return product_unit;
	}

	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}

	public String getProduct_alertquantity() {
		return product_alertquantity;
	}

	public void setProduct_alertquantity(String product_alertquantity) {
		this.product_alertquantity = product_alertquantity;
	}

	public String getProduct_supplierPrice() {
		return product_supplierPrice;
	}

	public void setProduct_supplierPrice(String product_supplierPrice) {
		this.product_supplierPrice = product_supplierPrice;
	}

	public String getProduct_sellPrice() {
		return product_sellPrice;
	}

	public void setProduct_sellPrice(String product_sellPrice) {
		this.product_sellPrice = product_sellPrice;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_tax() {
		return product_tax;
	}

	public void setProduct_tax(String product_tax) {
		this.product_tax = product_tax;
	}

	public String getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public String getProduct_details() {
		return product_details;
	}

	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}

	public String getProduct_detailsforinvoice() {
		return product_detailsforinvoice;
	}

	public void setProduct_detailsforinvoice(String product_detailsforinvoice) {
		this.product_detailsforinvoice = product_detailsforinvoice;
	}
	
	
}
