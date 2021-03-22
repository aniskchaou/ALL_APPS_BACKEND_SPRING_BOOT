package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.ApplyJobRepository;
import com.dev.delta.uprecruit.entities.ApplyJob;

@Service
public class ApplyJobService {
	@Autowired
	ApplyJobRepository  applyJobRepository;
	
	public ApplyJob saveOrUpdate(ApplyJob applyJob)
	{
		
		return applyJobRepository.save(applyJob);
	}
	
	public Iterable<ApplyJob> findAll()
	{
		return applyJobRepository.findAll();
	}
	
	public ApplyJob findById(Long id)
	{
		return applyJobRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ApplyJob applyJob=findById(id);
		applyJobRepository.delete(applyJob);
	}
}
