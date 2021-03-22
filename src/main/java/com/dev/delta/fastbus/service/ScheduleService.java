package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.ScheduleTravelRepository;
import com.dev.delta.fastbus.entities.Schedule;


@Service
public class ScheduleService {
	@Autowired
	ScheduleTravelRepository  scheduleRepository;
	
	public Schedule saveOrUpdate(Schedule schedule)
	{
		
		return scheduleRepository.save(schedule);
	}
	
	public Iterable<Schedule> findAll()
	{
		return scheduleRepository.findAll();
	}
	
	public Schedule findById(Long id)
	{
		return scheduleRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Schedule schedule=findById(id);
		scheduleRepository.delete(schedule);
	}
}
