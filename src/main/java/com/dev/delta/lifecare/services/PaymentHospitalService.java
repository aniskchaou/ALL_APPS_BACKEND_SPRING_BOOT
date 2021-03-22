package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.PaymentLifeCareRepository;
import com.dev.delta.lifecare.entities.PaymentHospial;

@Service
public class PaymentHospitalService {
	@Autowired
	PaymentLifeCareRepository  paymentRepository;
	
	public PaymentHospial saveOrUpdate(PaymentHospial payment)
	{
		
		return paymentRepository.save(payment);
	}
	
	public Iterable<PaymentHospial> findAll()
	{
		return paymentRepository.findAll();
	}
	
	public PaymentHospial findById(Long id)
	{
		return paymentRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		PaymentHospial payment=findById(id);
		paymentRepository.delete(payment);
	}
}
