package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.BuyPharmaRepository;
import com.dev.delta.pharmalife.entities.BuyPharma;

@Service
public class BuyPharmaService {
	@Autowired
	BuyPharmaRepository  categoryRepository;
	
	public BuyPharma saveOrUpdate(BuyPharma category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<BuyPharma> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public BuyPharma findById(Long id)
	{
		return categoryRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		BuyPharma category=findById(id);
		categoryRepository.delete(category);
	}
}
