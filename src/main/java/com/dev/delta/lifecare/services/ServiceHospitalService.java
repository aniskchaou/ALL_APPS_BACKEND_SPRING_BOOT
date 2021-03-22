package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.lifecare.dao.ServiceRepository;
import com.dev.delta.lifecare.entities.ServiceHospital;

@org.springframework.stereotype.Service
public class ServiceHospitalService {
	@Autowired
	ServiceRepository  serviceRepository;
	
	public ServiceHospital saveOrUpdate(ServiceHospital service)
	{
		
		return serviceRepository.save(service);
	}
	
	public Iterable<ServiceHospital> findAll()
	{
		return serviceRepository.findAll();
	}
	
	public ServiceHospital findById(Long id)
	{
		return serviceRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ServiceHospital service=findById(id);
		serviceRepository.delete(service);
	}
}
