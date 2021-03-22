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

import com.dev.delta.fastbus.entities.Travel;
import com.dev.delta.fastbus.service.TravelService;


@RestController
@RequestMapping("/fastbus/travel")
@CrossOrigin
public class TravelController {
	@Autowired
	TravelService travelService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Travel projectTravel, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Travel newPT = travelService.saveOrUpdate(projectTravel);

	        return new ResponseEntity<Travel>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Travel> getAllTravels()
   {
	   return travelService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Travel> getTravelById(@PathVariable Long id)
   {
	   Travel travel=travelService.findById(id);
	   return new ResponseEntity<Travel>(travel,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteTravel(@PathVariable Long id)
   {
	   travelService.delete(id);
	   return new ResponseEntity<String>("travel was deleted",HttpStatus.OK);
   }
}
