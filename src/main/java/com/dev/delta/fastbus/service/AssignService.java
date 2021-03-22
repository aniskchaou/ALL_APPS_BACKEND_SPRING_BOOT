package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.AssignRepository;
import com.dev.delta.fastbus.entities.Assign;

@Service
public class AssignService {
	@Autowired
	AssignRepository  assignRepository;
	
	public Assign saveOrUpdate(Assign assign)
	{
		
		return assignRepository.save(assign);
	}
	
	public Iterable<Assign> findAll()
	{
		return assignRepository.findAll();
	}
	
	public Assign findById(Long id)
	{
		return assignRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Assign assign=findById(id);
		assignRepository.delete(assign);
	}
}
