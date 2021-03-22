package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.CategoryRepository;
import com.dev.delta.uprecruit.entities.CategoryRecruit;

@Service
public class CategoryRecruitService {
	@Autowired
	CategoryRepository  categoryRepository;
	
	public CategoryRecruit saveOrUpdate(CategoryRecruit category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<CategoryRecruit> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public CategoryRecruit findById(Long id)
	{
		return categoryRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		CategoryRecruit category=findById(id);
		categoryRepository.delete(category);
	}
}
