package com.dev.delta.accountt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.ProductRepository;
import com.dev.delta.accountt.entities.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository  productRepository;
	
	public Product saveOrUpdate(Product product)
	{
		
		return productRepository.save(product);
	}
	
	public Iterable<Product> findAll()
	{
		return productRepository.findAll();
	}
	
	public Product findById(Long id)
	{
		return productRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Product product=findById(id);
		productRepository.delete(product);
	}
}
