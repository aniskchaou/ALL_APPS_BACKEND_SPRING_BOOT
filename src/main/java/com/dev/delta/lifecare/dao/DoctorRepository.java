package com.dev.delta.lifecare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.lifecare.entities.Doctor;
@RepositoryRestResource
public interface DoctorRepository  extends JpaRepository<Doctor, Long>  {

}
