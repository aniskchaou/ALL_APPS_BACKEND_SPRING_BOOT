package com.dev.delta.dentic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.dentic.dao.MedicamentRepository;
import com.dev.delta.dentic.entities.Medicament;


@Service
public class MedicamentService {
	@Autowired
	MedicamentRepository  medicamentRepository;
	
	public Medicament saveOrUpdate(Medicament medicament)
	{
		
		return medicamentRepository.save(medicament);
	}
	
	public Iterable<Medicament> findAll()
	{
		return medicamentRepository.findAll();
	}
	
	public Medicament findById(Long id)
	{
		return medicamentRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Medicament medicament=findById(id);
		medicamentRepository.delete(medicament);
	}
}
