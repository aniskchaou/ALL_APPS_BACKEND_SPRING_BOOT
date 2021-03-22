package com.dev.delta.dentic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.dentic.entities.Appointement;


@RepositoryRestResource
public interface AppointementDenticRepository extends JpaRepository<Appointement, Long>{

}
