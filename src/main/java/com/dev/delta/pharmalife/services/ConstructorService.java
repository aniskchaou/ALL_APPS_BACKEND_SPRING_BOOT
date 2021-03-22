package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.ConstructorRepository;
import com.dev.delta.pharmalife.entities.Constructor;

@Service
public class ConstructorService {
	@Autowired
	ConstructorRepository  constructorRepository;
	
	public Constructor saveOrUpdate(Constructor constructor)
	{
		
		return constructorRepository.save(constructor);
	}
	
	public Iterable<Constructor> findAll()
	{
		return constructorRepository.findAll();
	}
	
	public Constructor findById(Long id)
	{
		return constructorRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Constructor constructor=findById(id);
		constructorRepository.delete(constructor);
	}
}
