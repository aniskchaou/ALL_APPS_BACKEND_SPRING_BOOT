package com.dev.delta.accountt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.dao.AccountRepository;
import com.dev.delta.accountt.entities.Account;

@Service
public class AccountService {
	@Autowired
	AccountRepository  accountRepository;
	
	public Account saveOrUpdate(Account account)
	{
		
		return accountRepository.save(account);
	}
	
	public Iterable<Account> findAll()
	{
		return accountRepository.findAll();
	}
	
	public Account findById(Long id)
	{
		return accountRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Account account=findById(id);
		accountRepository.delete(account);
	}
}
