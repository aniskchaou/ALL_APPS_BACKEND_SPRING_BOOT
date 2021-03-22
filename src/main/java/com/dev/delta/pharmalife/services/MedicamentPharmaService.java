package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.MedicamentRepository;
import com.dev.delta.pharmalife.entities.MedicamentPharma;

@Service
public class MedicamentPharmaService {
	@Autowired
	MedicamentRepository  medicamentRepository;
	
	public MedicamentPharma saveOrUpdate(MedicamentPharma medicament)
	{
		
		return medicamentRepository.save(medicament);
	}
	
	public Iterable<MedicamentPharma> findAll()
	{
		return medicamentRepository.findAll();
	}
	
	public MedicamentPharma findById(Long id)
	{
		return medicamentRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		MedicamentPharma medicament=findById(id);
		medicamentRepository.delete(medicament);
	}
}
