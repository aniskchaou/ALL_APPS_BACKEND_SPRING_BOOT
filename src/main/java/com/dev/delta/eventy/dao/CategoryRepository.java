package com.dev.delta.eventy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.dentic.entities.Appointement;
import com.dev.delta.eventy.entities.Category;
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
