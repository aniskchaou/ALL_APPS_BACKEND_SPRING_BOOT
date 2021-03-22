package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.BuyStockRepository;
import com.dev.delta.stockbay.entities.Buy;
@Service

public class BuyService {
	@Autowired
	BuyStockRepository  buyRepository;
	
	public Buy saveOrUpdate(Buy buy)
	{
		
		return buyRepository.save(buy);
	}
	
	public Iterable<Buy> findAll()
	{
		return buyRepository.findAll();
	}
	
	public Buy findById(Long id)
	{
		return buyRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Buy buy=findById(id);
		buyRepository.delete(buy);
	}
}
