package com.dev.delta.dentic.controllers;

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

import com.dev.delta.dentic.entities.Patient;
import com.dev.delta.dentic.services.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {
	@Autowired
	PatientService patientService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Patient projectPatient, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Patient newPT = patientService.saveOrUpdate(projectPatient);

	        return new ResponseEntity<Patient>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Patient> getAllPatients()
   {
	   return patientService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Patient> getPatientById(@PathVariable Long id)
   {
	   Patient patient=patientService.findById(id);
	   return new ResponseEntity<Patient>(patient,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePatient(@PathVariable Long id)
   {
	   patientService.delete(id);
	   return new ResponseEntity<String>("patient was deleted",HttpStatus.OK);
   }
}
