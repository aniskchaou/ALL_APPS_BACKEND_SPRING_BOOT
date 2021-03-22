package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.CategoryStockRepository;
import com.dev.delta.stockbay.entities.CategoryStock;

@Service
public class CategoryStockService {
	@Autowired
	CategoryStockRepository  categoryRepository;
	
	public CategoryStock saveOrUpdate(CategoryStock category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<CategoryStock> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public CategoryStock findById(Long id)
	{
		return categoryRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		CategoryStock category=findById(id);
		categoryRepository.delete(category);
	}
}
