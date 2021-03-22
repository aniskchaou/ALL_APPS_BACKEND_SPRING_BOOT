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
import com.dev.delta.stockbay.entities.ProductStock;
import com.dev.delta.stockbay.services.ProductStockService;
@RestController
@RequestMapping("/stockbay/product")
@CrossOrigin
public class ProductStockController {
	@Autowired
	ProductStockService categoryService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody ProductStock projectProduct, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        ProductStock newPT = categoryService.saveOrUpdate(projectProduct);

	        return new ResponseEntity<ProductStock>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<ProductStock> getAllProducts()
   {
	   return categoryService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<ProductStock> getProductById(@PathVariable Long id)
   {
	   ProductStock category=categoryService.findById(id);
	   return new ResponseEntity<ProductStock>(category,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteProduct(@PathVariable Long id)
   {
	   categoryService.delete(id);
	   return new ResponseEntity<String>("category was deleted",HttpStatus.OK);
   }
}
