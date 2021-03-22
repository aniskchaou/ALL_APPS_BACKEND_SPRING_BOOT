package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.DepartementRepository;
import com.dev.delta.lifecare.entities.Departement;
@Service
public class DepartementService {
	@Autowired
	DepartementRepository  departementRepository;
	
	public Departement saveOrUpdate(Departement departement)
	{
		
		return departementRepository.save(departement);
	}
	
	public Iterable<Departement> findAll()
	{
		return departementRepository.findAll();
	}
	
	public Departement findById(Long id)
	{
		return departementRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Departement departement=findById(id);
		departementRepository.delete(departement);
	}
}
