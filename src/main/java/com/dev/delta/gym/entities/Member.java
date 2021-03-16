package com.dev.delta.gym.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Member {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  first_name;
	String     last_name;
	String     birth_date;
	String     groupe;
	String     type;
	String     address;
	String     mobile;
	String     email;
	String     weight;
	String     size;
	String     chest;
	String     foot;
	String     hand;
	String     fat;
	String     start_date;
	String     end_date;
	String    coach;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String first_name, String last_name, String birth_date, String groupe, String type, String address,
			String mobile, String email, String weight, String size, String chest, String foot, String hand, String fat,
			String start_date, String end_date, String coach) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_date = birth_date;
		this.groupe = groupe;
		this.type = type;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.weight = weight;
		this.size = size;
		this.chest = chest;
		this.foot = foot;
		this.hand = hand;
		this.fat = fat;
		this.start_date = start_date;
		this.end_date = end_date;
		this.coach = coach;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}
	
	
}
