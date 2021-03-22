package com.dev.delta.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.gym.entities.Activity;

@RepositoryRestResource
public interface ActivityGYMRepository  extends JpaRepository<Activity, Long>  {

}
