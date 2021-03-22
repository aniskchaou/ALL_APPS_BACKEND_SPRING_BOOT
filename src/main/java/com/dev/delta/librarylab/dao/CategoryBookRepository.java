package com.dev.delta.librarylab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.librarylab.entities.Category;
@RepositoryRestResource
public interface CategoryBookRepository extends JpaRepository<Category, Long>  {

}
