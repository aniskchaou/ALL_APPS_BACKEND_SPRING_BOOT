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

import com.dev.delta.lifecare.entities.ServiceHospital;
import com.dev.delta.lifecare.services.ServiceHospitalService;

@RestController
@RequestMapping("/lifecare/service")
@CrossOrigin
public class ServiceHospitalController {
	@Autowired
	ServiceHospitalService serviceService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody ServiceHospital projectService, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        ServiceHospital newPT = serviceService.saveOrUpdate(projectService);

	        return new ResponseEntity<ServiceHospital>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<ServiceHospital> getAllServices()
   {
	   return serviceService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<ServiceHospital> getServiceById(@PathVariable Long id)
   {
	   ServiceHospital service=serviceService.findById(id);
	   return new ResponseEntity<ServiceHospital>(service,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteService(@PathVariable Long id)
   {
	   serviceService.delete(id);
	   return new ResponseEntity<String>("service was deleted",HttpStatus.OK);
   }
}
