package com.dev.delta.accountt.controllers;

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

import com.dev.delta.accountt.entities.Tax;
import com.dev.delta.accountt.services.TaxService;

@RestController
@RequestMapping("/accountt/tax")
@CrossOrigin
public class TaxController {
	@Autowired
	TaxService taxService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Tax projectTax, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Tax newPT = taxService.saveOrUpdate(projectTax);

	        return new ResponseEntity<Tax>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Tax> getAllTaxs()
   {
	   return taxService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Tax> getTaxById(@PathVariable Long id)
   {
	   Tax tax=taxService.findById(id);
	   return new ResponseEntity<Tax>(tax,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteTax(@PathVariable Long id)
   {
	   taxService.delete(id);
	   return new ResponseEntity<String>("tax was deleted",HttpStatus.OK);
   }
}
