package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.TypeSubRepository;
import com.dev.delta.gym.entities.TypeSub;

@Service
public class TypeSubService {
	@Autowired
	TypeSubRepository  typeSubRepository;
	
	public TypeSub saveOrUpdate(TypeSub typeSub)
	{
		
		return typeSubRepository.save(typeSub);
	}
	
	public Iterable<TypeSub> findAll()
	{
		return typeSubRepository.findAll();
	}
	
	public TypeSub findById(Long id)
	{
		return typeSubRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		TypeSub typeSub=findById(id);
		typeSubRepository.delete(typeSub);
	}
}
