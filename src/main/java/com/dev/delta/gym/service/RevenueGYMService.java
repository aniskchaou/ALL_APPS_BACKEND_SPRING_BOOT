package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.RevenueGYMRepository;
import com.dev.delta.gym.entities.RevenueGYM;

@Service
public class RevenueGYMService {
	@Autowired
	RevenueGYMRepository  revenueRepository;
	
	public RevenueGYM saveOrUpdate(RevenueGYM revenue)
	{
		
		return revenueRepository.save(revenue);
	}
	
	public Iterable<RevenueGYM> findAll()
	{
		return revenueRepository.findAll();
	}
	
	public RevenueGYM findById(Long id)
	{
		return revenueRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		RevenueGYM revenue=findById(id);
		revenueRepository.delete(revenue);
	}
}
