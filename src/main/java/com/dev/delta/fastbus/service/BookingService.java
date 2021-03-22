package com.dev.delta.fastbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.dao.BookingRepository;
import com.dev.delta.fastbus.entities.Booking;

@Service
public class BookingService {
	@Autowired
	BookingRepository  bookingRepository;
	
	public Booking saveOrUpdate(Booking booking)
	{
		
		return bookingRepository.save(booking);
	}
	
	public Iterable<Booking> findAll()
	{
		return bookingRepository.findAll();
	}
	
	public Booking findById(Long id)
	{
		return bookingRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Booking booking=findById(id);
		bookingRepository.delete(booking);
	}
}
