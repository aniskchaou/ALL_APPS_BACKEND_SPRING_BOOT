package com.dev.delta.stockbay.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockbay_expense")
public class ExpenseStock {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   expense_paymentDate;
	String    supplier_id;
     String    expense_paymentType;
     String    expense_paymentAccount;
     String    expense_amount;
     String    expense_details;
     
     public ExpenseStock() {
		// TODO Auto-generated constructor stub
	}

	public ExpenseStock(String expense_paymentDate, String supplier_id, String expense_paymentType,
			String expense_paymentAccount, String expense_amount, String expense_details) {
		super();
		this.expense_paymentDate = expense_paymentDate;
		this.supplier_id = supplier_id;
		this.expense_paymentType = expense_paymentType;
		this.expense_paymentAccount = expense_paymentAccount;
		this.expense_amount = expense_amount;
		this.expense_details = expense_details;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense_paymentDate() {
		return expense_paymentDate;
	}

	public void setExpense_paymentDate(String expense_paymentDate) {
		this.expense_paymentDate = expense_paymentDate;
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getExpense_paymentType() {
		return expense_paymentType;
	}

	public void setExpense_paymentType(String expense_paymentType) {
		this.expense_paymentType = expense_paymentType;
	}

	public String getExpense_paymentAccount() {
		return expense_paymentAccount;
	}

	public void setExpense_paymentAccount(String expense_paymentAccount) {
		this.expense_paymentAccount = expense_paymentAccount;
	}

	public String getExpense_amount() {
		return expense_amount;
	}

	public void setExpense_amount(String expense_amount) {
		this.expense_amount = expense_amount;
	}

	public String getExpense_details() {
		return expense_details;
	}

	public void setExpense_details(String expense_details) {
		this.expense_details = expense_details;
	}
     
     
}
