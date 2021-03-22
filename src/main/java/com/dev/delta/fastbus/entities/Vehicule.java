package com.dev.delta.fastbus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="fastbus_vehicule")
public class Vehicule {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String reg_no;
	String    fleet_type_id;
	String      engine_no;
	String       model_no;
	String       chasis_no;
	String       owner;
	String       owner_phone;
	String       company;
	String       status;
	
	public Vehicule() {
		// TODO Auto-generated constructor stub
	}

	public Vehicule(String reg_no, String fleet_type_id, String engine_no, String model_no, String chasis_no,
			String owner, String owner_phone, String company, String status) {
		super();
		this.reg_no = reg_no;
		this.fleet_type_id = fleet_type_id;
		this.engine_no = engine_no;
		this.model_no = model_no;
		this.chasis_no = chasis_no;
		this.owner = owner;
		this.owner_phone = owner_phone;
		this.company = company;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getFleet_type_id() {
		return fleet_type_id;
	}

	public void setFleet_type_id(String fleet_type_id) {
		this.fleet_type_id = fleet_type_id;
	}

	public String getEngine_no() {
		return engine_no;
	}

	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public String getChasis_no() {
		return chasis_no;
	}

	public void setChasis_no(String chasis_no) {
		this.chasis_no = chasis_no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner_phone() {
		return owner_phone;
	}

	public void setOwner_phone(String owner_phone) {
		this.owner_phone = owner_phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
