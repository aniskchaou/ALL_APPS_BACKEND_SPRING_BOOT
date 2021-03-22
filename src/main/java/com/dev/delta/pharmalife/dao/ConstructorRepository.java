package com.dev.delta.pharmalife.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.pharmalife.entities.Constructor;
@RepositoryRestResource
public interface ConstructorRepository  extends JpaRepository<Constructor, Long> {

}
