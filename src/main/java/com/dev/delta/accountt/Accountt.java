package com.dev.delta.accountt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.ProductRepository;
import com.dev.delta.accountt.entities.Account;
import com.dev.delta.accountt.entities.Client;
import com.dev.delta.accountt.entities.Product;
import com.dev.delta.accountt.entities.Revenue;
import com.dev.delta.accountt.entities.Supplier;
import com.dev.delta.accountt.entities.Tax;
import com.dev.delta.accountt.services.AccountService;
import com.dev.delta.accountt.services.ClientService;
import com.dev.delta.accountt.services.ProductService;
import com.dev.delta.accountt.services.RevenueService;
import com.dev.delta.accountt.services.SupplierService;
import com.dev.delta.accountt.services.TaxService;

@Service
public class Accountt implements IAcountt {

	@Autowired
	ProductService productService;
	
	@Autowired
	AccountService accountService;
	
	@Autowired 
	ClientService clientService;
	
	@Autowired
	RevenueService revenueService; 
	
	@Autowired
	SupplierService supplierService;
	
	@Autowired
	TaxService taxService;
	
	@Override
	public void initProducts()
	{
		
		productService.saveOrUpdate(new Product("", "", "", "", "", "", "", ""));
	}

	@Override
	public void initAccounts() {
		accountService.saveOrUpdate(new Account("", "", "", "", "", ""));
		
	}

	@Override
	public void initClients() {
		clientService.saveOrUpdate(new Client("", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initRevenue() {
		revenueService.saveOrUpdate(new Revenue("", "", "", "", "", "", ""));
		
	}

	@Override
	public void initSuppliers() {
		supplierService.saveOrUpdate(new Supplier("", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initTaxes() {
		taxService.saveOrUpdate(new Tax("", ""));
		
	}
	
	

	@Override
	public void populate() {
		initAccounts();
		initClients();
		initProducts();
		initRevenue();
		initSuppliers();
		initTaxes();
	}
}
