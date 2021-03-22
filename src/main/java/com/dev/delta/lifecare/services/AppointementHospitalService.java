package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.AppointementRepository;
import com.dev.delta.lifecare.entities.AppointementHospital;

@Service
public class AppointementHospitalService {
	@Autowired
	AppointementRepository  appointementRepository;
	
	public AppointementHospital saveOrUpdate(AppointementHospital appointement)
	{
		
		return appointementRepository.save(appointement);
	}
	
	public Iterable<AppointementHospital> findAll()
	{
		return appointementRepository.findAll();
	}
	
	public AppointementHospital findById(Long id)
	{
		return appointementRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		AppointementHospital appointement=findById(id);
		appointementRepository.delete(appointement);
	}
}
