package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.accountt.entities.Product;
import com.dev.delta.accountt.entities.Revenue;
@RepositoryRestResource
public interface RevenueRepository extends JpaRepository<Revenue, Long> {

}
