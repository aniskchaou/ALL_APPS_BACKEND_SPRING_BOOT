package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.GroupeRepository;
import com.dev.delta.gym.entities.Groupe;
@Service
public class GroupeService {
	@Autowired
	GroupeRepository  groupeRepository;
	
	public Groupe saveOrUpdate(Groupe groupe)
	{
		
		return groupeRepository.save(groupe);
	}
	
	public Iterable<Groupe> findAll()
	{
		return groupeRepository.findAll();
	}
	
	public Groupe findById(Long id)
	{
		return groupeRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Groupe groupe=findById(id);
		groupeRepository.delete(groupe);
	}
}
