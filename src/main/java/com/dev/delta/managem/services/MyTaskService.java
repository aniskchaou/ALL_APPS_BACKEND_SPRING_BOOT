package com.dev.delta.managem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.dao.MyTaskRepository;
import com.dev.delta.managem.entities.MyTask;

@Service
public class MyTaskService {
	@Autowired
	MyTaskRepository  myTaskRepository;
	
	public MyTask saveOrUpdate(MyTask myTask)
	{
		
		return myTaskRepository.save(myTask);
	}
	
	public Iterable<MyTask> findAll()
	{
		return myTaskRepository.findAll();
	}
	
	public MyTask findById(Long id)
	{
		return myTaskRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		MyTask myTask=findById(id);
		myTaskRepository.delete(myTask);
	}
}
