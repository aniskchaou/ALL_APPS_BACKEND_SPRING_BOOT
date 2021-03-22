package com.dev.delta.eventy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.eventy.dao.CategoryEventRepository;
import com.dev.delta.eventy.entities.CategoryEvent;


@Service
public class CategoryService {
	@Autowired
	CategoryEventRepository  categoryRepository;
	
	public CategoryEvent saveOrUpdate(CategoryEvent category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<CategoryEvent> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public CategoryEvent findById(Long id)
	{
		return categoryRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		CategoryEvent category=findById(id);
		categoryRepository.delete(category);
	}
}
