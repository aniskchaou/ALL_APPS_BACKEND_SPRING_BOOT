package com.dev.delta.pharmalife.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.pharmalife.dao.ClientPharmaRepository;
import com.dev.delta.pharmalife.entities.ClientPharma;

@Service
public class ClientPharmaService {
	@Autowired
	ClientPharmaRepository  clientRepository;
	
	public ClientPharma saveOrUpdate(ClientPharma client)
	{
		
		return clientRepository.save(client);
	}
	
	public Iterable<ClientPharma> findAll()
	{
		return clientRepository.findAll();
	}
	
	public ClientPharma findById(Long id)
	{
		return clientRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ClientPharma client=findById(id);
		clientRepository.delete(client);
	}
}
