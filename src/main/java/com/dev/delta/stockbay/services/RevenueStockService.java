package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.RevenueRepository;
import com.dev.delta.stockbay.entities.RevenueStock;

@Service
public class RevenueStockService {
	@Autowired
	RevenueRepository  revenueRepository;
	
	public RevenueStock saveOrUpdate(RevenueStock revenue)
	{
		
		return revenueRepository.save(revenue);
	}
	
	public Iterable<RevenueStock> findAll()
	{
		return revenueRepository.findAll();
	}
	
	public RevenueStock findById(Long id)
	{
		return revenueRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		RevenueStock revenue=findById(id);
		revenueRepository.delete(revenue);
	}
}
