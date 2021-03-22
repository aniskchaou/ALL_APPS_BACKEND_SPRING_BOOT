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

import com.dev.delta.pharmalife.entities.SupplierPharma;
import com.dev.delta.pharmalife.services.SupplierPharmaService;


@RestController
@RequestMapping("/pharmalife/supplier")
@CrossOrigin
public class SupplierPharmaController {
	@Autowired
	SupplierPharmaService supplierService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody SupplierPharma projectSupplier, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        SupplierPharma newPT = supplierService.saveOrUpdate(projectSupplier);

	        return new ResponseEntity<SupplierPharma>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<SupplierPharma> getAllSuppliers()
   {
	   return supplierService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<SupplierPharma> getSupplierById(@PathVariable Long id)
   {
	   SupplierPharma supplier=supplierService.findById(id);
	   return new ResponseEntity<SupplierPharma>(supplier,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteSupplier(@PathVariable Long id)
   {
	   supplierService.delete(id);
	   return new ResponseEntity<String>("supplier was deleted",HttpStatus.OK);
   }
}
