package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.InsuranceRepository;
import com.dev.delta.lifecare.entities.Insurance;

@Service
public class InsuranceService {
	@Autowired
	InsuranceRepository  insuranceRepository;
	
	public Insurance saveOrUpdate(Insurance insurance)
	{
		
		return insuranceRepository.save(insurance);
	}
	
	public Iterable<Insurance> findAll()
	{
		return insuranceRepository.findAll();
	}
	
	public Insurance findById(Long id)
	{
		return insuranceRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Insurance insurance=findById(id);
		insuranceRepository.delete(insurance);
	}
}
