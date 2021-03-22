package com.dev.delta.managem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.managem.entities.Clientt;


@RepositoryRestResource
public interface ClientManagemRepository  extends JpaRepository<Clientt, Long> {

}
