package com.dev.delta.pharmalife.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.pharmalife.entities.BuyPharma;
@RepositoryRestResource
public interface BuyPharmaRepository extends JpaRepository<BuyPharma, Long>  {

}
