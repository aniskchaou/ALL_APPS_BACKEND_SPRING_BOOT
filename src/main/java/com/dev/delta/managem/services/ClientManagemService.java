package com.dev.delta.managem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.dao.ClientManagemRepository;
import com.dev.delta.managem.entities.Clientt;

@Service
public class ClientManagemService {
	@Autowired
	ClientManagemRepository  clientRepository;
	
	public Clientt saveOrUpdate(Clientt client)
	{
		
		return clientRepository.save(client);
	}
	
	public Iterable<Clientt> findAll()
	{
		return clientRepository.findAll();
	}
	
	public Clientt findById(Long id)
	{
		return clientRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Clientt client=findById(id);
		clientRepository.delete(client);
	}
}
