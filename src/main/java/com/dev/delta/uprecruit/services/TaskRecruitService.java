package com.dev.delta.uprecruit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.dao.TaskRecruitRepository;
import com.dev.delta.uprecruit.entities.TaskRecruit;

@Service
public class TaskRecruitService {
	@Autowired
	TaskRecruitRepository  taskRepository;
	
	public TaskRecruit saveOrUpdate(TaskRecruit task)
	{
		
		return taskRepository.save(task);
	}
	
	public Iterable<TaskRecruit> findAll()
	{
		return taskRepository.findAll();
	}
	
	public TaskRecruit findById(Long id)
	{
		return taskRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		TaskRecruit task=findById(id);
		taskRepository.delete(task);
	}
}
