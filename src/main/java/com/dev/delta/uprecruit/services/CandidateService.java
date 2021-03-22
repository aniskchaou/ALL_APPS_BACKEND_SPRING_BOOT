package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.CandidateRepository;
import com.dev.delta.uprecruit.entities.Candidate;

@Service
public class CandidateService {
	@Autowired
	CandidateRepository  candidateRepository;
	
	public Candidate saveOrUpdate(Candidate candidate)
	{
		
		return candidateRepository.save(candidate);
	}
	
	public Iterable<Candidate> findAll()
	{
		return candidateRepository.findAll();
	}
	
	public Candidate findById(Long id)
	{
		return candidateRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Candidate candidate=findById(id);
		candidateRepository.delete(candidate);
	}
}
