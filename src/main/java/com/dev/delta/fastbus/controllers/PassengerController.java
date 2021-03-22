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

import com.dev.delta.fastbus.entities.Passenger;
import com.dev.delta.fastbus.service.PassengerService;

@RestController
@RequestMapping("/fastbus/passenger")
@CrossOrigin
public class PassengerController {
	@Autowired
	PassengerService passengerService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Passenger projectPassenger, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Passenger newPT = passengerService.saveOrUpdate(projectPassenger);

	        return new ResponseEntity<Passenger>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Passenger> getAllPassengers()
   {
	   return passengerService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Passenger> getPassengerById(@PathVariable Long id)
   {
	   Passenger passenger=passengerService.findById(id);
	   return new ResponseEntity<Passenger>(passenger,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePassenger(@PathVariable Long id)
   {
	   passengerService.delete(id);
	   return new ResponseEntity<String>("passenger was deleted",HttpStatus.OK);
   }
}
