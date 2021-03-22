package com.dev.delta.librarylab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.librarylab.dao.MemberRepository;
import com.dev.delta.librarylab.entities.Member;


@Service
public class MemberService {
	@Autowired
	MemberRepository  memberRepository;
	
	public Member saveOrUpdate(Member member)
	{
		
		return memberRepository.save(member);
	}
	
	public Iterable<Member> findAll()
	{
		return memberRepository.findAll();
	}
	
	public Member findById(Long id)
	{
		return memberRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Member member=findById(id);
		memberRepository.delete(member);
	}
}
