package com.dev.delta.lifecare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.lifecare.entities.PrescriptionHospital;
@RepositoryRestResource
public interface PrescriptionHospitalRepository  extends JpaRepository<PrescriptionHospital, Long> {

}
