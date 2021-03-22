package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.CategoryPharmaRepository;
import com.dev.delta.pharmalife.entities.CategoryPharma;

@Service
public class CategoryPharmaService {
	@Autowired
	CategoryPharmaRepository  categoryRepository;
	
	public CategoryPharma saveOrUpdate(CategoryPharma category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<CategoryPharma> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public CategoryPharma findById(Long id)
	{
		return categoryRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		CategoryPharma category=findById(id);
		categoryRepository.delete(category);
	}
}
