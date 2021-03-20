package com.dev.delta.dentic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.accountt.entities.Product;
import com.dev.delta.dentic.entities.Prescription;
@RepositoryRestResource
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

}
