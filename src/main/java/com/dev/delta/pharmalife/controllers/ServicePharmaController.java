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

import com.dev.delta.pharmalife.entities.ServicePharma;
import com.dev.delta.pharmalife.services.ServicePharmaService;


@RestController
@RequestMapping("/pharmalife/service")
@CrossOrigin
public class ServicePharmaController {
	@Autowired
	ServicePharmaService serviceService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody ServicePharma projectService, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        ServicePharma newPT = serviceService.saveOrUpdate(projectService);

	        return new ResponseEntity<ServicePharma>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<ServicePharma> getAllServices()
   {
	   return serviceService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<ServicePharma> getServiceById(@PathVariable Long id)
   {
	   ServicePharma service=serviceService.findById(id);
	   return new ResponseEntity<ServicePharma>(service,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteService(@PathVariable Long id)
   {
	   serviceService.delete(id);
	   return new ResponseEntity<String>("service was deleted",HttpStatus.OK);
   }
}
