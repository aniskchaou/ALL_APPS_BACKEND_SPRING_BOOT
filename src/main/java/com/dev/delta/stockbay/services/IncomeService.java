package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.IncomeRepository;
import com.dev.delta.stockbay.entities.IncomeStock;

@Service
public class IncomeService {
	@Autowired
	IncomeRepository  incomeRepository;
	
	public IncomeStock saveOrUpdate(IncomeStock income)
	{
		
		return incomeRepository.save(income);
	}
	
	public Iterable<IncomeStock> findAll()
	{
		return incomeRepository.findAll();
	}
	
	public IncomeStock findById(Long id)
	{
		return incomeRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		IncomeStock income=findById(id);
		incomeRepository.delete(income);
	}
}
