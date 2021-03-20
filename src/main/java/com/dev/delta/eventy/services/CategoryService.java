package com.dev.delta.eventy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.eventy.dao.CategoryRepository;
import com.dev.delta.eventy.entities.Category;


@Service
public class CategoryService {
	@Autowired
	CategoryRepository  categoryRepository;
	
	public Category saveOrUpdate(Category category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<Category> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id)
	{
		return categoryRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Category category=findById(id);
		categoryRepository.delete(category);
	}
}
