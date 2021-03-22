package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.TypeRepository;
import com.dev.delta.pharmalife.entities.Type;

@Service
public class TypeService {
	@Autowired
	TypeRepository  typeRepository;
	
	public Type saveOrUpdate(Type type)
	{
		
		return typeRepository.save(type);
	}
	
	public Iterable<Type> findAll()
	{
		return typeRepository.findAll();
	}
	
	public Type findById(Long id)
	{
		return typeRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Type type=findById(id);
		typeRepository.delete(type);
	}
}
