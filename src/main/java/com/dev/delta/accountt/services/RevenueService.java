package com.dev.delta.accountt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.RevenueRepository;
import com.dev.delta.accountt.entities.Revenue;


@Service
public class RevenueService {
	@Autowired
	RevenueRepository  revenueRepository;
	
	public Revenue saveOrUpdate(Revenue revenue)
	{
		
		return revenueRepository.save(revenue);
	}
	
	public Iterable<Revenue> findAll()
	{
		return revenueRepository.findAll();
	}
	
	public Revenue findById(Long id)
	{
		return revenueRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Revenue revenue=findById(id);
		revenueRepository.delete(revenue);
	}
}
