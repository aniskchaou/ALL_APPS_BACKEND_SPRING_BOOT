package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.ScheduleRepository;
import com.dev.delta.lifecare.entities.ScheduleHospital;

@Service
public class ScheduleHospitalService {
	@Autowired
	ScheduleRepository  scheduleRepository;
	
	public ScheduleHospital saveOrUpdate(ScheduleHospital schedule)
	{
		
		return scheduleRepository.save(schedule);
	}
	
	public Iterable<ScheduleHospital> findAll()
	{
		return scheduleRepository.findAll();
	}
	
	public ScheduleHospital findById(Long id)
	{
		return scheduleRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ScheduleHospital schedule=findById(id);
		scheduleRepository.delete(schedule);
	}
}
