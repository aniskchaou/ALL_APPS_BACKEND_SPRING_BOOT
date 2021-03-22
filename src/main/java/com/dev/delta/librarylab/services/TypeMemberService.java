package com.dev.delta.librarylab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.librarylab.dao.TypeMemberRepository;
import com.dev.delta.librarylab.entities.TypeMember;

@Service
public class TypeMemberService {
	@Autowired
	TypeMemberRepository  typeMemberRepository;
	
	public TypeMember saveOrUpdate(TypeMember typeMember)
	{
		
		return typeMemberRepository.save(typeMember);
	}
	
	public Iterable<TypeMember> findAll()
	{
		return typeMemberRepository.findAll();
	}
	
	public TypeMember findById(Long id)
	{
		return typeMemberRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		TypeMember typeMember=findById(id);
		typeMemberRepository.delete(typeMember);
	}
}
