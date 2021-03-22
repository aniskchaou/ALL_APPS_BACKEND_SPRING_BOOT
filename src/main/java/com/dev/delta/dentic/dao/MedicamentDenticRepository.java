package com.dev.delta.dentic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.accountt.entities.Product;
import com.dev.delta.dentic.entities.Medicament;
@RepositoryRestResource
public interface MedicamentDenticRepository extends JpaRepository<Medicament, Long> {

}
