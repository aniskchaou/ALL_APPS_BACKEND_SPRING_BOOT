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

import com.dev.delta.lifecare.entities.Doctor;
import com.dev.delta.lifecare.services.DoctorService;

@RestController
@RequestMapping("/lifecare/doctor")
@CrossOrigin
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Doctor projectDoctor, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Doctor newPT = doctorService.saveOrUpdate(projectDoctor);

	        return new ResponseEntity<Doctor>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Doctor> getAllDoctors()
   {
	   return doctorService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id)
   {
	   Doctor doctor=doctorService.findById(id);
	   return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteDoctor(@PathVariable Long id)
   {
	   doctorService.delete(id);
	   return new ResponseEntity<String>("doctor was deleted",HttpStatus.OK);
   }
}
