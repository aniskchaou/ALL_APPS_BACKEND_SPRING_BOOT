package com.dev.delta.managem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.managem.entities.Project;
@RepositoryRestResource
public interface ProjectRepository extends JpaRepository<Project, Long>  {

}
