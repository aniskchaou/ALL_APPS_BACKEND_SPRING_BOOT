package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.EventGYMRepository;
import com.dev.delta.gym.entities.EventGYM;

@Service
public class EventGYMService {
	@Autowired
	EventGYMRepository  eventRepository;
	
	public EventGYM saveOrUpdate(EventGYM event)
	{
		
		return eventRepository.save(event);
	}
	
	public Iterable<EventGYM> findAll()
	{
		return eventRepository.findAll();
	}
	
	public EventGYM findById(Long id)
	{
		return eventRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		EventGYM event=findById(id);
		eventRepository.delete(event);
	}
}
