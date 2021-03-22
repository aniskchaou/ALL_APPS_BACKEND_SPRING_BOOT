package com.dev.delta.eventy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.eventy.dao.UserEventRepository;
import com.dev.delta.eventy.entities.UserEvent;
@Service
public class UserService {
	@Autowired
	UserEventRepository  userRepository;
	
	public UserEvent saveOrUpdate(UserEvent user)
	{
		
		return userRepository.save(user);
	}
	
	public Iterable<UserEvent> findAll()
	{
		return userRepository.findAll();
	}
	
	public UserEvent findById(Long id)
	{
		return userRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		UserEvent user=findById(id);
		userRepository.delete(user);
	}
}
