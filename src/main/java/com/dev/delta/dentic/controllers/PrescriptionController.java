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

import com.dev.delta.dentic.entities.Prescription;
import com.dev.delta.dentic.services.PrescriptionService;

@RestController
@RequestMapping("/dentic/prescription")
@CrossOrigin
public class PrescriptionController {
	@Autowired
	PrescriptionService prescriptionService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Prescription projectPrescription, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Prescription newPT = prescriptionService.saveOrUpdate(projectPrescription);

	        return new ResponseEntity<Prescription>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Prescription> getAllPrescriptions()
   {
	   return prescriptionService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Prescription> getPrescriptionById(@PathVariable Long id)
   {
	   Prescription prescription=prescriptionService.findById(id);
	   return new ResponseEntity<Prescription>(prescription,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePrescription(@PathVariable Long id)
   {
	   prescriptionService.delete(id);
	   return new ResponseEntity<String>("prescription was deleted",HttpStatus.OK);
   }
}
