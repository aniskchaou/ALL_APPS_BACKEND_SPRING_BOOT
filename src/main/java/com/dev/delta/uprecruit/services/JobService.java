package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.JobRepository;
import com.dev.delta.uprecruit.entities.Job;

@Service
public class JobService {
	@Autowired
	JobRepository  jobRepository;
	
	public Job saveOrUpdate(Job job)
	{
		
		return jobRepository.save(job);
	}
	
	public Iterable<Job> findAll()
	{
		return jobRepository.findAll();
	}
	
	public Job findById(Long id)
	{
		return jobRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Job job=findById(id);
		jobRepository.delete(job);
	}
}
