package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.ServicePharmaRepository;
import com.dev.delta.pharmalife.entities.ServicePharma;

@Service
public class ServicePharmaService {
	@Autowired
	ServicePharmaRepository  serviceRepository;
	
	public ServicePharma saveOrUpdate(ServicePharma service)
	{
		
		return serviceRepository.save(service);
	}
	
	public Iterable<ServicePharma> findAll()
	{
		return serviceRepository.findAll();
	}
	
	public ServicePharma findById(Long id)
	{
		return serviceRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ServicePharma service=findById(id);
		serviceRepository.delete(service);
	}
}
