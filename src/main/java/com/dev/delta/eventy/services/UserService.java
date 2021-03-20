package com.dev.delta.eventy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.eventy.dao.UserRepository;
import com.dev.delta.eventy.entities.User;
@Service
public class UserService {
	@Autowired
	UserRepository  userRepository;
	
	public User saveOrUpdate(User user)
	{
		
		return userRepository.save(user);
	}
	
	public Iterable<User> findAll()
	{
		return userRepository.findAll();
	}
	
	public User findById(Long id)
	{
		return userRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		User user=findById(id);
		userRepository.delete(user);
	}
}
