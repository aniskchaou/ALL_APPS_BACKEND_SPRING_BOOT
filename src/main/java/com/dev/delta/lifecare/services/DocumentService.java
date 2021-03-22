package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.DocumentRepository;
import com.dev.delta.lifecare.entities.Document;

@Service
public class DocumentService {
	@Autowired
	DocumentRepository  documentRepository;
	
	public Document saveOrUpdate(Document document)
	{
		
		return documentRepository.save(document);
	}
	
	public Iterable<Document> findAll()
	{
		return documentRepository.findAll();
	}
	
	public Document findById(Long id)
	{
		return documentRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Document document=findById(id);
		documentRepository.delete(document);
	}
}
