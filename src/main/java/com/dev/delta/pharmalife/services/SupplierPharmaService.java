package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.SupplierRepository;
import com.dev.delta.pharmalife.entities.SupplierPharma;

@Service
public class SupplierPharmaService {
	@Autowired
	SupplierRepository  supplierRepository;
	
	public SupplierPharma saveOrUpdate(SupplierPharma supplier)
	{
		
		return supplierRepository.save(supplier);
	}
	
	public Iterable<SupplierPharma> findAll()
	{
		return supplierRepository.findAll();
	}
	
	public SupplierPharma findById(Long id)
	{
		return supplierRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		SupplierPharma supplier=findById(id);
		supplierRepository.delete(supplier);
	}
}
