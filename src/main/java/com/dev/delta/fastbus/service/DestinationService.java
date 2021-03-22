package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.DestinationRepository;
import com.dev.delta.fastbus.entities.Destination;


@Service
public class DestinationService {
	@Autowired
	DestinationRepository  destinationRepository;
	
	public Destination saveOrUpdate(Destination destination)
	{
		
		return destinationRepository.save(destination);
	}
	
	public Iterable<Destination> findAll()
	{
		return destinationRepository.findAll();
	}
	
	public Destination findById(Long id)
	{
		return destinationRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Destination destination=findById(id);
		destinationRepository.delete(destination);
	}
}
