package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.SellRepository;
import com.dev.delta.stockbay.entities.Sell;

@Service
public class SellService {
	@Autowired
	SellRepository  sellRepository;
	
	public Sell saveOrUpdate(Sell sell)
	{
		
		return sellRepository.save(sell);
	}
	
	public Iterable<Sell> findAll()
	{
		return sellRepository.findAll();
	}
	
	public Sell findById(Long id)
	{
		return sellRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Sell sell=findById(id);
		sellRepository.delete(sell);
	}
}
