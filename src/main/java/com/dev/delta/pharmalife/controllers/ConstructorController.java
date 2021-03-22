package com.dev.delta.pharmalife.controllers;

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

import com.dev.delta.pharmalife.entities.Constructor;
import com.dev.delta.pharmalife.services.ConstructorService;

@RestController
@RequestMapping("/pharmalife/constructor")
@CrossOrigin
public class ConstructorController {
	@Autowired
	ConstructorService constructorService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Constructor projectConstructor, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Constructor newPT = constructorService.saveOrUpdate(projectConstructor);

	        return new ResponseEntity<Constructor>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Constructor> getAllConstructors()
   {
	   return constructorService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Constructor> getConstructorById(@PathVariable Long id)
   {
	   Constructor constructor=constructorService.findById(id);
	   return new ResponseEntity<Constructor>(constructor,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteConstructor(@PathVariable Long id)
   {
	   constructorService.delete(id);
	   return new ResponseEntity<String>("constructor was deleted",HttpStatus.OK);
   }
}
