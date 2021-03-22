package com.dev.delta.librarylab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.librarylab.entities.TypeMember;
@RepositoryRestResource
public interface TypeMemberRepository extends JpaRepository<TypeMember, Long>  {

}
