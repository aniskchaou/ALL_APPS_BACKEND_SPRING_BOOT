package com.dev.delta.stockbay.controllers;

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

import com.dev.delta.eventy.dao.EventRepository;
import com.dev.delta.eventy.entities.Event;
import com.dev.delta.stockbay.entities.SupplierStock;
import com.dev.delta.stockbay.services.SupplierStockService;
@RestController
@RequestMapping("/stockbay/supplier")
@CrossOrigin
public class SupplierStockController {
	@Autowired
	SupplierStockService supplierService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody SupplierStock projectSupplier, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        SupplierStock newPT = supplierService.saveOrUpdate(projectSupplier);

	        return new ResponseEntity<SupplierStock>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<SupplierStock> getAllSuppliers()
   {
	   return supplierService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<SupplierStock> getSupplierById(@PathVariable Long id)
   {
	   SupplierStock supplier=supplierService.findById(id);
	   return new ResponseEntity<SupplierStock>(supplier,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteSupplier(@PathVariable Long id)
   {
	   supplierService.delete(id);
	   return new ResponseEntity<String>("supplier was deleted",HttpStatus.OK);
   }
}
