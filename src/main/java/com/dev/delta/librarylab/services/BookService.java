package com.dev.delta.librarylab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.librarylab.dao.BookRepository;
import com.dev.delta.librarylab.entities.Book;

@Service
public class BookService {
	@Autowired
	BookRepository  bookRepository;
	
	public Book saveOrUpdate(Book book)
	{
		
		return bookRepository.save(book);
	}
	
	public Iterable<Book> findAll()
	{
		return bookRepository.findAll();
	}
	
	public Book findById(Long id)
	{
		return bookRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Book book=findById(id);
		bookRepository.delete(book);
	}
}
