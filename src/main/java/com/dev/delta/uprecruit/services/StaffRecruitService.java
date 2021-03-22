package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.StaffRecruitRepository;
import com.dev.delta.uprecruit.entities.StaffRecruit;

@Service
public class StaffRecruitService {
	@Autowired
	StaffRecruitRepository  staffRepository;
	
	public StaffRecruit saveOrUpdate(StaffRecruit staff)
	{
		
		return staffRepository.save(staff);
	}
	
	public Iterable<StaffRecruit> findAll()
	{
		return staffRepository.findAll();
	}
	
	public StaffRecruit findById(Long id)
	{
		return staffRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		StaffRecruit staff=findById(id);
		staffRepository.delete(staff);
	}
}
