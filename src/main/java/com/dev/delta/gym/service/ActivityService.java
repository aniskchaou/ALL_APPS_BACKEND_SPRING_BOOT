package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.ActivityGYMRepository;
import com.dev.delta.gym.entities.Activity;
@Service
public class ActivityService {
	@Autowired
	ActivityGYMRepository  activityRepository;
	
	public Activity saveOrUpdate(Activity activity)
	{
		
		return activityRepository.save(activity);
	}
	
	public Iterable<Activity> findAll()
	{
		return activityRepository.findAll();
	}
	
	public Activity findById(Long id)
	{
		return activityRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Activity activity=findById(id);
		activityRepository.delete(activity);
	}
}
