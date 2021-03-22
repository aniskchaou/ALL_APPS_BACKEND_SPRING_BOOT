package com.dev.delta.lifecare.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="lifecare_prescription")
public class PrescriptionHospital {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   patient_id;
	String     food_allergies;
	String    tendency_bleed;
	String    heart_disease;
	String    high_blood_pressure;
	String    diabetic;
	String    surgery;
	String    accident;
	String    others;
     String    family_medical_history;
     String    current_medication;
     String   female_pregnancy;
     String   breast_feeding;
     String   health_insurance;
     String    low_income;
     String   reference;
     String   status;
     
     public PrescriptionHospital() {
		// TODO Auto-generated constructor stub
	}

	public PrescriptionHospital(String patient_id, String food_allergies, String tendency_bleed, String heart_disease,
			String high_blood_pressure, String diabetic, String surgery, String accident, String others,
			String family_medical_history, String current_medication, String female_pregnancy, String breast_feeding,
			String health_insurance, String low_income, String reference, String status) {
		super();
		this.patient_id = patient_id;
		this.food_allergies = food_allergies;
		this.tendency_bleed = tendency_bleed;
		this.heart_disease = heart_disease;
		this.high_blood_pressure = high_blood_pressure;
		this.diabetic = diabetic;
		this.surgery = surgery;
		this.accident = accident;
		this.others = others;
		this.family_medical_history = family_medical_history;
		this.current_medication = current_medication;
		this.female_pregnancy = female_pregnancy;
		this.breast_feeding = breast_feeding;
		this.health_insurance = health_insurance;
		this.low_income = low_income;
		this.reference = reference;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getFood_allergies() {
		return food_allergies;
	}

	public void setFood_allergies(String food_allergies) {
		this.food_allergies = food_allergies;
	}

	public String getTendency_bleed() {
		return tendency_bleed;
	}

	public void setTendency_bleed(String tendency_bleed) {
		this.tendency_bleed = tendency_bleed;
	}

	public String getHeart_disease() {
		return heart_disease;
	}

	public void setHeart_disease(String heart_disease) {
		this.heart_disease = heart_disease;
	}

	public String getHigh_blood_pressure() {
		return high_blood_pressure;
	}

	public void setHigh_blood_pressure(String high_blood_pressure) {
		this.high_blood_pressure = high_blood_pressure;
	}

	public String getDiabetic() {
		return diabetic;
	}

	public void setDiabetic(String diabetic) {
		this.diabetic = diabetic;
	}

	public String getSurgery() {
		return surgery;
	}

	public void setSurgery(String surgery) {
		this.surgery = surgery;
	}

	public String getAccident() {
		return accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getFamily_medical_history() {
		return family_medical_history;
	}

	public void setFamily_medical_history(String family_medical_history) {
		this.family_medical_history = family_medical_history;
	}

	public String getCurrent_medication() {
		return current_medication;
	}

	public void setCurrent_medication(String current_medication) {
		this.current_medication = current_medication;
	}

	public String getFemale_pregnancy() {
		return female_pregnancy;
	}

	public void setFemale_pregnancy(String female_pregnancy) {
		this.female_pregnancy = female_pregnancy;
	}

	public String getBreast_feeding() {
		return breast_feeding;
	}

	public void setBreast_feeding(String breast_feeding) {
		this.breast_feeding = breast_feeding;
	}

	public String getHealth_insurance() {
		return health_insurance;
	}

	public void setHealth_insurance(String health_insurance) {
		this.health_insurance = health_insurance;
	}

	public String getLow_income() {
		return low_income;
	}

	public void setLow_income(String low_income) {
		this.low_income = low_income;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
     
     
}
