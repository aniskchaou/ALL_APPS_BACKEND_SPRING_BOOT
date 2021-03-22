package com.dev.delta.stockbay.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.stockbay.entities.Buy;

@RepositoryRestResource
public interface BuyStockRepository extends JpaRepository<Buy, Long>  {

}
