package com.dev.delta.fastbus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.dentic.entities.Appointement;
import com.dev.delta.fastbus.entities.Assign;
@RepositoryRestResource
public interface AssignRepository extends JpaRepository<Assign, Long> {

}
