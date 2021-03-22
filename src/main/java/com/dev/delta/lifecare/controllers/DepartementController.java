package com.dev.delta.lifecare.controllers;

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

import com.dev.delta.lifecare.entities.Departement;
import com.dev.delta.lifecare.services.DepartementService;

@RestController
@RequestMapping("/lifecare/departement")
@CrossOrigin
public class DepartementController {
	@Autowired
	DepartementService departementService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Departement projectDepartement, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Departement newPT = departementService.saveOrUpdate(projectDepartement);

	        return new ResponseEntity<Departement>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Departement> getAllDepartements()
   {
	   return departementService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Departement> getDepartementById(@PathVariable Long id)
   {
	   Departement departement=departementService.findById(id);
	   return new ResponseEntity<Departement>(departement,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteDepartement(@PathVariable Long id)
   {
	   departementService.delete(id);
	   return new ResponseEntity<String>("departement was deleted",HttpStatus.OK);
   }
}
