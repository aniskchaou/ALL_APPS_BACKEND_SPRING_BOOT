package com.dev.delta.gym.controllers;

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

import com.dev.delta.gym.entities.ProductGYM;
import com.dev.delta.gym.service.ProductGYMService;

@RestController
@RequestMapping("/fastbus/product")
@CrossOrigin
public class ProductGYMController {
	@Autowired
	ProductGYMService productService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody ProductGYM projectProduct, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        ProductGYM newPT = productService.saveOrUpdate(projectProduct);

	        return new ResponseEntity<ProductGYM>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<ProductGYM> getAllProducts()
   {
	   return productService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<ProductGYM> getProductById(@PathVariable Long id)
   {
	   ProductGYM product=productService.findById(id);
	   return new ResponseEntity<ProductGYM>(product,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteProduct(@PathVariable Long id)
   {
	   productService.delete(id);
	   return new ResponseEntity<String>("product was deleted",HttpStatus.OK);
   }
}
