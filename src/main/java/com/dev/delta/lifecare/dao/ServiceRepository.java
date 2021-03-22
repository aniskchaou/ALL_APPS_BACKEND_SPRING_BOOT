package com.dev.delta.lifecare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.lifecare.entities.ServiceHospital;
@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<ServiceHospital, Long>  {

}
