package com.dev.delta.accountt.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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

import com.dev.delta.accountt.dao.ProductRepository;
import com.dev.delta.accountt.entities.Product;
import com.dev.delta.accountt.services.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Product projectProduct, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Product newPT = productService.saveOrUpdate(projectProduct);

	        return new ResponseEntity<Product>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Product> getAllProducts()
   {
	   return productService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Product> getProductById(@PathVariable Long id)
   {
	   Product product=productService.findById(id);
	   return new ResponseEntity<Product>(product,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteProduct(@PathVariable Long id)
   {
	   productService.delete(id);
	   return new ResponseEntity<String>("product was deleted",HttpStatus.OK);
   }
}
