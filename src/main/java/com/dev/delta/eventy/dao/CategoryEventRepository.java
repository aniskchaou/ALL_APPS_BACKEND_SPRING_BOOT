package com.dev.delta.eventy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.dentic.entities.Appointement;
import com.dev.delta.eventy.entities.CategoryEvent;
@RepositoryRestResource
public interface CategoryEventRepository extends JpaRepository<CategoryEvent, Long> {

}
