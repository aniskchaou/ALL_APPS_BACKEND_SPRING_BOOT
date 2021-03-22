package com.dev.delta.uprecruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.uprecruit.entities.TaskRecruit;
@RepositoryRestResource
public interface TaskRecruitRepository extends JpaRepository<TaskRecruit, Long>  {

}
