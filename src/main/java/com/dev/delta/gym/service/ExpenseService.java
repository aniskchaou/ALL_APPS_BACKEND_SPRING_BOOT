package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.ExpenseGYMRepository;
import com.dev.delta.gym.entities.Expense;

@Service
public class ExpenseService {
	@Autowired
	ExpenseGYMRepository  expenseRepository;
	
	public Expense saveOrUpdate(Expense expense)
	{
		
		return expenseRepository.save(expense);
	}
	
	public Iterable<Expense> findAll()
	{
		return expenseRepository.findAll();
	}
	
	public Expense findById(Long id)
	{
		return expenseRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Expense expense=findById(id);
		expenseRepository.delete(expense);
	}
}
