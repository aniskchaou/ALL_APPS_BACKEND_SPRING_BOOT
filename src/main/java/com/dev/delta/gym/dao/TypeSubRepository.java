package com.dev.delta.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.gym.entities.TypeSub;
@RepositoryRestResource
public interface TypeSubRepository extends JpaRepository<TypeSub, Long>  {

}
