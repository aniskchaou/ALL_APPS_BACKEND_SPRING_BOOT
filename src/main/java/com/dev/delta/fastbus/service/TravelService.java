package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.TravelRepository;
import com.dev.delta.fastbus.entities.Travel;

@Service
public class TravelService {
	@Autowired
	TravelRepository  travelRepository;
	
	public Travel saveOrUpdate(Travel travel)
	{
		
		return travelRepository.save(travel);
	}
	
	public Iterable<Travel> findAll()
	{
		return travelRepository.findAll();
	}
	
	public Travel findById(Long id)
	{
		return travelRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Travel travel=findById(id);
		travelRepository.delete(travel);
	}
}
