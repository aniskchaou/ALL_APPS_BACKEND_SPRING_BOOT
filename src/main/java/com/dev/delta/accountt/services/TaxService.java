package com.dev.delta.accountt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.TaxRepository;
import com.dev.delta.accountt.entities.Tax;

@Service
public class TaxService {
	@Autowired
	TaxRepository  taxRepository;
	
	public Tax saveOrUpdate(Tax tax)
	{
		
		return taxRepository.save(tax);
	}
	
	public Iterable<Tax> findAll()
	{
		return taxRepository.findAll();
	}
	
	public Tax findById(Long id)
	{
		return taxRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Tax tax=findById(id);
		taxRepository.delete(tax);
	}
}
