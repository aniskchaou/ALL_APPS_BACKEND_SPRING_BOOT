package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.ExerciceRepository;
import com.dev.delta.gym.entities.Exercice;

@Service
public class ExerciceService {
	@Autowired
	ExerciceRepository  exerciceRepository;
	
	public Exercice saveOrUpdate(Exercice exercice)
	{
		
		return exerciceRepository.save(exercice);
	}
	
	public Iterable<Exercice> findAll()
	{
		return exerciceRepository.findAll();
	}
	
	public Exercice findById(Long id)
	{
		return exerciceRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Exercice exercice=findById(id);
		exerciceRepository.delete(exercice);
	}
}
