package com.dev.delta.stockbay.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.stockbay.entities.ExpenseStock;
@RepositoryRestResource
public interface ExpenseStockRepository extends JpaRepository<ExpenseStock, Long>  {

}
