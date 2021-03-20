package com.dev.delta.dentic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.dentic.dao.PrescriptionRepository;
import com.dev.delta.dentic.entities.Prescription;

@Service
public class PrescriptionService {
	@Autowired
	PrescriptionRepository  prescriptionRepository;
	
	public Prescription saveOrUpdate(Prescription prescription)
	{
		
		return prescriptionRepository.save(prescription);
	}
	
	public Iterable<Prescription> findAll()
	{
		return prescriptionRepository.findAll();
	}
	
	public Prescription findById(Long id)
	{
		return prescriptionRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Prescription prescription=findById(id);
		prescriptionRepository.delete(prescription);
	}
}
