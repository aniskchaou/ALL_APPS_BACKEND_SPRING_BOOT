package com.dev.delta.managem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.dao.TaskRepository;
import com.dev.delta.managem.entities.Task;

@Service
public class TaskService {
	@Autowired
	TaskRepository  taskRepository;
	
	public Task saveOrUpdate(Task task)
	{
		
		return taskRepository.save(task);
	}
	
	public Iterable<Task> findAll()
	{
		return taskRepository.findAll();
	}
	
	public Task findById(Long id)
	{
		return taskRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Task task=findById(id);
		taskRepository.delete(task);
	}
}
