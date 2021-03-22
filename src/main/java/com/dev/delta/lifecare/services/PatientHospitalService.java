package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.PatientRepository;
import com.dev.delta.lifecare.entities.PatientHospital;

@Service
public class PatientHospitalService {
	@Autowired
	PatientRepository  patientRepository;
	
	public PatientHospital saveOrUpdate(PatientHospital patient)
	{
		
		return patientRepository.save(patient);
	}
	
	public Iterable<PatientHospital> findAll()
	{
		return patientRepository.findAll();
	}
	
	public PatientHospital findById(Long id)
	{
		return patientRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		PatientHospital patient=findById(id);
		patientRepository.delete(patient);
	}
}
