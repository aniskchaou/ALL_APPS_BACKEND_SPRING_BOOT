package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.StaffGYMRepository;
import com.dev.delta.gym.entities.Staff;

@Service
public class StaffService {
	@Autowired
	StaffGYMRepository  staffRepository;
	
	public Staff saveOrUpdate(Staff staff)
	{
		
		return staffRepository.save(staff);
	}
	
	public Iterable<Staff> findAll()
	{
		return staffRepository.findAll();
	}
	
	public Staff findById(Long id)
	{
		return staffRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Staff staff=findById(id);
		staffRepository.delete(staff);
	}
}
