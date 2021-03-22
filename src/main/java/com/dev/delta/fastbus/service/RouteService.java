package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.RouteRepository;
import com.dev.delta.fastbus.entities.Route;

@Service
public class RouteService {
	@Autowired
	RouteRepository  routeRepository;
	
	public Route saveOrUpdate(Route route)
	{
		
		return routeRepository.save(route);
	}
	
	public Iterable<Route> findAll()
	{
		return routeRepository.findAll();
	}
	
	public Route findById(Long id)
	{
		return routeRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Route route=findById(id);
		routeRepository.delete(route);
	}
}
