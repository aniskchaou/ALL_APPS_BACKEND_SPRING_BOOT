package com.dev.delta.accountt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.ClientRepository;
import com.dev.delta.accountt.entities.Client;
@Service
public class ClientService {
	@Autowired
	ClientRepository  clientRepository;
	
	public Client saveOrUpdate(Client client)
	{
		
		return clientRepository.save(client);
	}
	
	public Iterable<Client> findAll()
	{
		return clientRepository.findAll();
	}
	
	public Client findById(Long id)
	{
		return clientRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Client client=findById(id);
		clientRepository.delete(client);
	}
}
