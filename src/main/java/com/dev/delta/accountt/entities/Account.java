package com.dev.delta.accountt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="accountt_account")
public class Account {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	 String holder_name;
	 String bank_name;
	 String account_number;
	 String opening_balance;
	 String contact_number;
	 String bank_address;
	 
	 public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String holder_name, String bank_name, String account_number, String opening_balance,
			String contact_number, String bank_address) {
		super();
		this.holder_name = holder_name;
		this.bank_name = bank_name;
		this.account_number = account_number;
		this.opening_balance = opening_balance;
		this.contact_number = contact_number;
		this.bank_address = bank_address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(String opening_balance) {
		this.opening_balance = opening_balance;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getBank_address() {
		return bank_address;
	}

	public void setBank_address(String bank_address) {
		this.bank_address = bank_address;
	}
	 
	 
}
