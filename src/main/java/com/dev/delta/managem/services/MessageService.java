package com.dev.delta.managem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.dao.MessageRepository;
import com.dev.delta.managem.entities.Message;

@Service
public class MessageService {
	@Autowired
	MessageRepository  messageRepository;
	
	public Message saveOrUpdate(Message message)
	{
		
		return messageRepository.save(message);
	}
	
	public Iterable<Message> findAll()
	{
		return messageRepository.findAll();
	}
	
	public Message findById(Long id)
	{
		return messageRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Message message=findById(id);
		messageRepository.delete(message);
	}
}
