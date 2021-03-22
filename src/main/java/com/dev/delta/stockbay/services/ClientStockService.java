package com.dev.delta.stockbay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.stockbay.dao.ClientStockRepository;
import com.dev.delta.stockbay.entities.ClientStock;

@Service
public class ClientStockService {
	@Autowired
	ClientStockRepository  clientRepository;
	
	public ClientStock saveOrUpdate(ClientStock client)
	{
		
		return clientRepository.save(client);
	}
	
	public Iterable<ClientStock> findAll()
	{
		return clientRepository.findAll();
	}
	
	public ClientStock findById(Long id)
	{
		return clientRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		ClientStock client=findById(id);
		clientRepository.delete(client);
	}
}
