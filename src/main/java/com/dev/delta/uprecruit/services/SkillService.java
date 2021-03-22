package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.SkillRepository;
import com.dev.delta.uprecruit.entities.Skill;

@Service
public class SkillService {
	@Autowired
	SkillRepository  skillRepository;
	
	public Skill saveOrUpdate(Skill skill)
	{
		
		return skillRepository.save(skill);
	}
	
	public Iterable<Skill> findAll()
	{
		return skillRepository.findAll();
	}
	
	public Skill findById(Long id)
	{
		return skillRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Skill skill=findById(id);
		skillRepository.delete(skill);
	}
}
