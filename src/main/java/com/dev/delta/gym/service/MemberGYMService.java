package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.MemberGYMRepository;
import com.dev.delta.gym.entities.MemberGYM;

@Service
public class MemberGYMService {
	@Autowired
	MemberGYMRepository  memberRepository;
	
	public MemberGYM saveOrUpdate(MemberGYM member)
	{
		
		return memberRepository.save(member);
	}
	
	public Iterable<MemberGYM> findAll()
	{
		return memberRepository.findAll();
	}
	
	public MemberGYM findById(Long id)
	{
		return memberRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		MemberGYM member=findById(id);
		memberRepository.delete(member);
	}
}
