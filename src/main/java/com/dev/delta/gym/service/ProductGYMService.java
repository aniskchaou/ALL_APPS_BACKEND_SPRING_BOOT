package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.ProductGYMRepository;
import com.dev.delta.gym.entities.ProductGYM;

@Service
public class ProductGYMService {
	@Autowired
	ProductGYMRepository  productRepository;
	
	public ProductGYM saveOrUpdate(ProductGYM product)
	{
		
		return productRepository.save(product);
	}
	
	public Iterable<ProductGYM> findAll()
	{
		return productRepository.findAll();
	}
	
	public ProductGYM findById(Long id)
	{
		return productRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ProductGYM product=findById(id);
		productRepository.delete(product);
	}
}
