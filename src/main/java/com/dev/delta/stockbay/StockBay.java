package com.dev.delta.stockbay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.services.SupplierService;
import com.dev.delta.gym.entities.Expense;
import com.dev.delta.gym.service.ExpenseService;
import com.dev.delta.stockbay.entities.Buy;
import com.dev.delta.stockbay.entities.CategoryStock;
import com.dev.delta.stockbay.entities.ClientStock;
import com.dev.delta.stockbay.entities.IncomeStock;
import com.dev.delta.stockbay.entities.ProductStock;
import com.dev.delta.stockbay.entities.RevenueStock;
import com.dev.delta.stockbay.entities.Sell;
import com.dev.delta.stockbay.entities.SupplierStock;
import com.dev.delta.stockbay.services.BuyService;
import com.dev.delta.stockbay.services.CategoryStockService;
import com.dev.delta.stockbay.services.ClientStockService;
import com.dev.delta.stockbay.services.IncomeService;
import com.dev.delta.stockbay.services.ProductStockService;
import com.dev.delta.stockbay.services.RevenueStockService;
import com.dev.delta.stockbay.services.SellService;
import com.dev.delta.stockbay.services.SupplierStockService;

@Service
public class StockBay implements IStockBay{

	@Autowired
	BuyService buyService;
	@Autowired
	CategoryStockService categoryStockService;
	@Autowired
	ClientStockService clientStockService;
	@Autowired
	ExpenseService expenseService;
	@Autowired 
	IncomeService incomeService;
	@Autowired
	ProductStockService productStockService;
	@Autowired
	RevenueStockService revenueStockService;
	@Autowired
	SellService sellService;
	@Autowired
	SupplierStockService supplierStockService;
	
	
	
	@Override
	public void initBuys() {
		buyService.saveOrUpdate(new Buy("", "", "", "", ""));
		
	}

	@Override
	public void initCategories() {
	categoryStockService.saveOrUpdate(new CategoryStock("", "", ""));
		
	}

	@Override
	public void initClients() {
	clientStockService.saveOrUpdate(new ClientStock("", "", "", "", "", ""));
		
	}

	@Override
	public void initExpenses() {
		expenseService.saveOrUpdate(new Expense("", "", ""));
	}

	@Override
	public void initIncomes() {
		incomeService.saveOrUpdate(new IncomeStock("", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initProducts() {
		productStockService.saveOrUpdate(new ProductStock("", "", "", "", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initRevenues() {
		revenueStockService.saveOrUpdate(new RevenueStock("", "", "", "", "", ""));
		
	}

	@Override
	public void initSells() {
		sellService.saveOrUpdate(new Sell("", "", "", ""));
		
	}

	@Override
	public void initSuppliers() {
		supplierStockService.saveOrUpdate(new SupplierStock("", "", "", "", "", "", ""));
		
	}

	@Override
	public void populate() {
		initBuys();
		initCategories();
		initClients();
		initExpenses();
		initIncomes();
		initProducts();
		initRevenues();
		initSells();
		initSuppliers();
		
	}

}
