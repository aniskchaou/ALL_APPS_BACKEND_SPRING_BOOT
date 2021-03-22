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

import com.dev.delta.fastbus.entities.Price;
import com.dev.delta.fastbus.service.PriceService;

@RestController
@RequestMapping("/fastbus/price")
@CrossOrigin
public class PriceController {
	@Autowired
	PriceService priceService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Price projectPrice, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Price newPT = priceService.saveOrUpdate(projectPrice);

	        return new ResponseEntity<Price>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Price> getAllPrices()
   {
	   return priceService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Price> getPriceById(@PathVariable Long id)
   {
	   Price price=priceService.findById(id);
	   return new ResponseEntity<Price>(price,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePrice(@PathVariable Long id)
   {
	   priceService.delete(id);
	   return new ResponseEntity<String>("price was deleted",HttpStatus.OK);
   }
}
