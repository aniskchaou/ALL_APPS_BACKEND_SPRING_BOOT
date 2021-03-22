package com.dev.delta.eventy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.eventy.entities.CategoryEvent;
import com.dev.delta.eventy.entities.Event;
import com.dev.delta.eventy.entities.UserEvent;
import com.dev.delta.eventy.services.CategoryService;
import com.dev.delta.eventy.services.EventService;
import com.dev.delta.eventy.services.UserService;

@Service
public class Eventy {
	
	@Autowired
	CategoryService categoryService;
	
	 @Autowired
	 EventService eventService;
	 
	 
	 @Autowired
	 UserService userService;

	public void initCategories()
	{
		categoryService.saveOrUpdate(new CategoryEvent("", ""));
	}
	
	public void initEvents()
	{
		eventService.saveOrUpdate(new Event("", "", "", ""));
	}
	
	public void initUsers()
	{
		userService.saveOrUpdate(new UserEvent("", "", "", ""));
	}
	
	public void populate()
	{
		initCategories();
		initEvents();
		initUsers();
	}
}
