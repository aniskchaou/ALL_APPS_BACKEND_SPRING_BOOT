package com.dev.delta.pharmalife.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.pharmalife.entities.SupplierPharma;
@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<SupplierPharma, Long>  {

}
