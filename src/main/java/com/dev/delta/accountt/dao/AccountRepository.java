package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.accountt.Accountt;
import com.dev.delta.accountt.entities.Account;
import com.dev.delta.accountt.entities.Product;
@RepositoryRestResource
public interface AccountRepository extends JpaRepository<Account, Long> {

}
