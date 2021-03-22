package com.dev.delta.managem.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.managem.entities.Project;
import com.dev.delta.managem.services.ProjectService;

@RestController
@RequestMapping("/managem/project")
@CrossOrigin
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Project projectProject, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Project newPT = projectService.saveOrUpdate(projectProject);

	        return new ResponseEntity<Project>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Project> getAllProjects()
   {
	   return projectService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Project> getProjectById(@PathVariable Long id)
   {
	   Project project=projectService.findById(id);
	   return new ResponseEntity<Project>(project,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteProject(@PathVariable Long id)
   {
	   projectService.delete(id);
	   return new ResponseEntity<String>("project was deleted",HttpStatus.OK);
   }
}
