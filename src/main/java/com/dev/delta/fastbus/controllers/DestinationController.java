package com.dev.delta.fastbus.controllers;

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

import com.dev.delta.fastbus.entities.Destination;
import com.dev.delta.fastbus.service.DestinationService;

@RestController
@RequestMapping("/fastbus/destination")
@CrossOrigin
public class DestinationController {
	@Autowired
	DestinationService destinationService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Destination projectDestination, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Destination newPT = destinationService.saveOrUpdate(projectDestination);

	        return new ResponseEntity<Destination>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Destination> getAllDestinations()
   {
	   return destinationService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Destination> getDestinationById(@PathVariable Long id)
   {
	   Destination destination=destinationService.findById(id);
	   return new ResponseEntity<Destination>(destination,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteDestination(@PathVariable Long id)
   {
	   destinationService.delete(id);
	   return new ResponseEntity<String>("destination was deleted",HttpStatus.OK);
   }
}
