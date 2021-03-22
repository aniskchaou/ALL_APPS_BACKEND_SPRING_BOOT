package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.PriceRepository;
import com.dev.delta.fastbus.entities.Price;

@Service
public class PriceService {
	@Autowired
	PriceRepository  priceRepository;
	
	public Price saveOrUpdate(Price price)
	{
		
		return priceRepository.save(price);
	}
	
	public Iterable<Price> findAll()
	{
		return priceRepository.findAll();
	}
	
	public Price findById(Long id)
	{
		return priceRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Price price=findById(id);
		priceRepository.delete(price);
	}
}
