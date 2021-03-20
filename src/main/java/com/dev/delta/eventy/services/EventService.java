package com.dev.delta.eventy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.eventy.dao.EventRepository;
import com.dev.delta.eventy.entities.Event;


@Service
public class EventService {
	@Autowired
	EventRepository  eventRepository;
	
	public Event saveOrUpdate(Event event)
	{
		
		return eventRepository.save(event);
	}
	
	public Iterable<Event> findAll()
	{
		return eventRepository.findAll();
	}
	
	public Event findById(Long id)
	{
		return eventRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Event event=findById(id);
		eventRepository.delete(event);
	}
}
