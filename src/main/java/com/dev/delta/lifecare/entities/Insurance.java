package com.dev.delta.lifecare.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Insurance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   insurance_name;
	String    service_tax;
	String    discount;
	String    remark;
	String   insurance_no;
	String    insurance_code;
	String    disease_name;
	String    disease_charge;
	String    hospital_rate;
	String    insurance_rate;
	String   total;
	String    status;
	
	public Insurance() {
		// TODO Auto-generated constructor stub
	}

	public Insurance(String insurance_name, String service_tax, String discount, String remark, String insurance_no,
			String insurance_code, String disease_name, String disease_charge, String hospital_rate,
			String insurance_rate, String total, String status) {
		super();
		this.insurance_name = insurance_name;
		this.service_tax = service_tax;
		this.discount = discount;
		this.remark = remark;
		this.insurance_no = insurance_no;
		this.insurance_code = insurance_code;
		this.disease_name = disease_name;
		this.disease_charge = disease_charge;
		this.hospital_rate = hospital_rate;
		this.insurance_rate = insurance_rate;
		this.total = total;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInsurance_name() {
		return insurance_name;
	}

	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}

	public String getService_tax() {
		return service_tax;
	}

	public void setService_tax(String service_tax) {
		this.service_tax = service_tax;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}

	public String getInsurance_code() {
		return insurance_code;
	}

	public void setInsurance_code(String insurance_code) {
		this.insurance_code = insurance_code;
	}

	public String getDisease_name() {
		return disease_name;
	}

	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}

	public String getDisease_charge() {
		return disease_charge;
	}

	public void setDisease_charge(String disease_charge) {
		this.disease_charge = disease_charge;
	}

	public String getHospital_rate() {
		return hospital_rate;
	}

	public void setHospital_rate(String hospital_rate) {
		this.hospital_rate = hospital_rate;
	}

	public String getInsurance_rate() {
		return insurance_rate;
	}

	public void setInsurance_rate(String insurance_rate) {
		this.insurance_rate = insurance_rate;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
