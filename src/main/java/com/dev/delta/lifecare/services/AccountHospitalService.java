package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.AccountHospitalRepository;
import com.dev.delta.lifecare.entities.AccountHospital;

@Service
public class AccountHospitalService {
	@Autowired
	AccountHospitalRepository  accountRepository;
	
	public AccountHospital saveOrUpdate(AccountHospital account)
	{
		
		return accountRepository.save(account);
	}
	
	public Iterable<AccountHospital> findAll()
	{
		return accountRepository.findAll();
	}
	
	public AccountHospital findById(Long id)
	{
		return accountRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		AccountHospital account=findById(id);
		accountRepository.delete(account);
	}
}
