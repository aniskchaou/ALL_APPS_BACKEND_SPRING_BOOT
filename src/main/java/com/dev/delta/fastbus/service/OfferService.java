package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.OfferRepository;
import com.dev.delta.fastbus.entities.Offer;

@Service
public class OfferService {
	@Autowired
	OfferRepository  offerRepository;
	
	public Offer saveOrUpdate(Offer offer)
	{
		
		return offerRepository.save(offer);
	}
	
	public Iterable<Offer> findAll()
	{
		return offerRepository.findAll();
	}
	
	public Offer findById(Long id)
	{
		return offerRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Offer offer=findById(id);
		offerRepository.delete(offer);
	}
}
