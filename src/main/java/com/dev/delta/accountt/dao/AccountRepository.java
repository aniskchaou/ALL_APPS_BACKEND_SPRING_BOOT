package com.dev.delta.accountt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.accountt.Accountt;
import com.dev.delta.accountt.entities.Account;
import com.dev.delta.accountt.entities.Product;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
