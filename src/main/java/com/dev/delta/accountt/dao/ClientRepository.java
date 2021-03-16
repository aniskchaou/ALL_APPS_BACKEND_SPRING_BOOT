package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.accountt.entities.Client;
import com.dev.delta.accountt.entities.Product;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
