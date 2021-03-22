package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.SupplierStockRepository;
import com.dev.delta.stockbay.entities.SupplierStock;

@Service
public class SupplierStockService {
	@Autowired
	SupplierStockRepository  supplierRepository;
	
	public SupplierStock saveOrUpdate(SupplierStock supplier)
	{
		
		return supplierRepository.save(supplier);
	}
	
	public Iterable<SupplierStock> findAll()
	{
		return supplierRepository.findAll();
	}
	
	public SupplierStock findById(Long id)
	{
		return supplierRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		SupplierStock supplier=findById(id);
		supplierRepository.delete(supplier);
	}
}
