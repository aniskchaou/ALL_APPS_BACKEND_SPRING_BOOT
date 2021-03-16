package com.dev.delta.accountt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.SupplierRepository;
import com.dev.delta.accountt.entities.Supplier;


@Service
public class SupplierService {
	@Autowired
	SupplierRepository  supplierRepository;
	
	public Supplier saveOrUpdate(Supplier supplier)
	{
		
		return supplierRepository.save(supplier);
	}
	
	public Iterable<Supplier> findAll()
	{
		return supplierRepository.findAll();
	}
	
	public Supplier findById(Long id)
	{
		return supplierRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Supplier supplier=findById(id);
		supplierRepository.delete(supplier);
	}
}
