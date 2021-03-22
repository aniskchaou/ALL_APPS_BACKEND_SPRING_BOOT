package com.dev.delta.managem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.dao.ProjectRepository;
import com.dev.delta.managem.entities.Project;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository  projectRepository;
	
	public Project saveOrUpdate(Project project)
	{
		
		return projectRepository.save(project);
	}
	
	public Iterable<Project> findAll()
	{
		return projectRepository.findAll();
	}
	
	public Project findById(Long id)
	{
		return projectRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Project project=findById(id);
		projectRepository.delete(project);
	}
}
