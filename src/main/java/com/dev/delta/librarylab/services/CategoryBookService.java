package com.dev.delta.librarylab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.librarylab.dao.CategoryBookRepository;
import com.dev.delta.librarylab.entities.Category;

@Service
public class CategoryBookService {
	@Autowired
	CategoryBookRepository  categoryRepository;
	
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
