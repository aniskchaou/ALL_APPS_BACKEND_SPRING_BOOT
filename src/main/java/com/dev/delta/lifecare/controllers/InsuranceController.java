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

import com.dev.delta.lifecare.entities.Insurance;
import com.dev.delta.lifecare.services.InsuranceService;


@RestController
@RequestMapping("/lifecare/insurance")
@CrossOrigin
public class InsuranceController {
	@Autowired
	InsuranceService insuranceService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Insurance projectInsurance, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Insurance newPT = insuranceService.saveOrUpdate(projectInsurance);

	        return new ResponseEntity<Insurance>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Insurance> getAllInsurances()
   {
	   return insuranceService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Insurance> getInsuranceById(@PathVariable Long id)
   {
	   Insurance insurance=insuranceService.findById(id);
	   return new ResponseEntity<Insurance>(insurance,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteInsurance(@PathVariable Long id)
   {
	   insuranceService.delete(id);
	   return new ResponseEntity<String>("insurance was deleted",HttpStatus.OK);
   }
}
