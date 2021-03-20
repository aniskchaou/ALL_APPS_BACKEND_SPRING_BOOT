package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.accountt.entities.Product;
import com.dev.delta.accountt.entities.Tax;
@RepositoryRestResource
public interface TaxRepository extends JpaRepository<Tax, Long> {

}
