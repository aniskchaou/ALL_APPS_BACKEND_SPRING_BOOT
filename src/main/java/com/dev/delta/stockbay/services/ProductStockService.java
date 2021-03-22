package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.ProductRepository;
import com.dev.delta.stockbay.entities.ProductStock;

@Service
public class ProductStockService {
	@Autowired
	ProductRepository  productRepository;
	
	public ProductStock saveOrUpdate(ProductStock product)
	{
		
		return productRepository.save(product);
	}
	
	public Iterable<ProductStock> findAll()
	{
		return productRepository.findAll();
	}
	
	public ProductStock findById(Long id)
	{
		return productRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ProductStock product=findById(id);
		productRepository.delete(product);
	}
}
