package com.dev.delta.accountt;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.accountt.entities.Product;
import com.dev.delta.accountt.services.ProductService;

public class Accountt {

	@Autowired
    ProductService productService;
	
	public void initProducts()
	{
		productService.saveOrUpdate(new Product("", "", "", "", "", "", "", ""));
	}
}
