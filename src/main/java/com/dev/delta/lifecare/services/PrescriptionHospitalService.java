package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.PrescriptionHospitalRepository;
import com.dev.delta.lifecare.entities.PrescriptionHospital;

@Service
public class PrescriptionHospitalService {
	@Autowired
	PrescriptionHospitalRepository  prescriptionRepository;
	
	public PrescriptionHospital saveOrUpdate(PrescriptionHospital prescription)
	{
		
		return prescriptionRepository.save(prescription);
	}
	
	public Iterable<PrescriptionHospital> findAll()
	{
		return prescriptionRepository.findAll();
	}
	
	public PrescriptionHospital findById(Long id)
	{
		return prescriptionRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		PrescriptionHospital prescription=findById(id);
		prescriptionRepository.delete(prescription);
	}
}
