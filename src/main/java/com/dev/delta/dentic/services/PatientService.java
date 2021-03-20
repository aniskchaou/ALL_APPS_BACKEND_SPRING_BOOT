package com.dev.delta.dentic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.dentic.dao.PatientRepository;
import com.dev.delta.dentic.entities.Patient;

@Service
public class PatientService {
	@Autowired
	PatientRepository  patientRepository;
	
	public Patient saveOrUpdate(Patient patient)
	{
		
		return patientRepository.save(patient);
	}
	
	public Iterable<Patient> findAll()
	{
		return patientRepository.findAll();
	}
	
	public Patient findById(Long id)
	{
		return patientRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Patient patient=findById(id);
		patientRepository.delete(patient);
	}
}
