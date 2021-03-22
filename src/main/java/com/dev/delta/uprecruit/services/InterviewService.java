package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.InterviewRepository;
import com.dev.delta.uprecruit.entities.Interview;

@Service
public class InterviewService {
	@Autowired
	InterviewRepository  interviewRepository;
	
	public Interview saveOrUpdate(Interview interview)
	{
		
		return interviewRepository.save(interview);
	}
	
	public Iterable<Interview> findAll()
	{
		return interviewRepository.findAll();
	}
	
	public Interview findById(Long id)
	{
		return interviewRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Interview interview=findById(id);
		interviewRepository.delete(interview);
	}
}
