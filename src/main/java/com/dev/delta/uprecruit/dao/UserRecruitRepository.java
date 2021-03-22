package com.dev.delta.uprecruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
@RepositoryRestResource
public interface UserRecruitRepository  extends JpaRepository<Assign, Long>  {

}
