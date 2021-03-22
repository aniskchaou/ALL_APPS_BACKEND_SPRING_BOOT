package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.ExpenseStockRepository;
import com.dev.delta.stockbay.entities.ExpenseStock;

@Service
public class ExpenseStockService {
	@Autowired
	ExpenseStockRepository  expenseRepository;
	
	public ExpenseStock saveOrUpdate(ExpenseStock expense)
	{
		
		return expenseRepository.save(expense);
	}
	
	public Iterable<ExpenseStock> findAll()
	{
		return expenseRepository.findAll();
	}
	
	public ExpenseStock findById(Long id)
	{
		return expenseRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ExpenseStock expense=findById(id);
		expenseRepository.delete(expense);
	}
}
