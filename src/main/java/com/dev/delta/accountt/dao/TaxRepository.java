package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.accountt.entities.Product;
import com.dev.delta.accountt.entities.Tax;

public interface TaxRepository extends JpaRepository<Tax, Long> {

}
