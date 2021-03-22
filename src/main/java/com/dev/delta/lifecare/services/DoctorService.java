package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.DoctorRepository;
import com.dev.delta.lifecare.entities.Doctor;

@Service
public class DoctorService {
	@Autowired
	DoctorRepository  doctorRepository;
	
	public Doctor saveOrUpdate(Doctor doctor)
	{
		
		return doctorRepository.save(doctor);
	}
	
	public Iterable<Doctor> findAll()
	{
		return doctorRepository.findAll();
	}
	
	public Doctor findById(Long id)
	{
		return doctorRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Doctor doctor=findById(id);
		doctorRepository.delete(doctor);
	}
}
