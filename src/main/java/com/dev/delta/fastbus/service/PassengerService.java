package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.PassengerRepository;
import com.dev.delta.fastbus.entities.Passenger;

@Service
public class PassengerService {
	@Autowired
	PassengerRepository  passengerRepository;
	
	public Passenger saveOrUpdate(Passenger passenger)
	{
		
		return passengerRepository.save(passenger);
	}
	
	public Iterable<Passenger> findAll()
	{
		return passengerRepository.findAll();
	}
	
	public Passenger findById(Long id)
	{
		return passengerRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Passenger passenger=findById(id);
		passengerRepository.delete(passenger);
	}
}
