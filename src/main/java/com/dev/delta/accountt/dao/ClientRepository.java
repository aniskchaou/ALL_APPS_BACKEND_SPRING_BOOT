package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.accountt.entities.Client;
import com.dev.delta.accountt.entities.Product;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

}
