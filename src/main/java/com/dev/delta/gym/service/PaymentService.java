package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.PaymentRepository;
import com.dev.delta.gym.entities.PaymentGYM;
@Service
public class PaymentService {
	@Autowired
	PaymentRepository  paymentRepository;
	
	public PaymentGYM saveOrUpdate(PaymentGYM payment)
	{
		
		return paymentRepository.save(payment);
	}
	
	public Iterable<PaymentGYM> findAll()
	{
		return paymentRepository.findAll();
	}
	
	public PaymentGYM findById(Long id)
	{
		return paymentRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		PaymentGYM payment=findById(id);
		paymentRepository.delete(payment);
	}
}
