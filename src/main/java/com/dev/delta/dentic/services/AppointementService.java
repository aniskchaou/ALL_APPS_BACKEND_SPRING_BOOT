package com.dev.delta.dentic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.dentic.dao.AppointementDenticRepository;
import com.dev.delta.dentic.entities.Appointement;

@Service
public class AppointementService {
	@Autowired
	AppointementDenticRepository  appointementRepository;
	
	public Appointement saveOrUpdate(Appointement appointement)
	{
		
		return appointementRepository.save(appointement);
	}
	
	public Iterable<Appointement> findAll()
	{
		return appointementRepository.findAll();
	}
	
	public Appointement findById(Long id)
	{
		return appointementRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Appointement appointement=findById(id);
		appointementRepository.delete(appointement);
	}
}
