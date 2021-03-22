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

import com.dev.delta.lifecare.entities.AccountHospital;
import com.dev.delta.lifecare.services.AccountHospitalService;

@RestController
@RequestMapping("/lifecare/account")
@CrossOrigin
public class AccountHospitalController {
	@Autowired
	AccountHospitalService bookService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody AccountHospital projectAccount, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        AccountHospital newPT = bookService.saveOrUpdate(projectAccount);

	        return new ResponseEntity<AccountHospital>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<AccountHospital> getAllAccounts()
   {
	   return bookService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<AccountHospital> getAccountById(@PathVariable Long id)
   {
	   AccountHospital book=bookService.findById(id);
	   return new ResponseEntity<AccountHospital>(book,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteAccount(@PathVariable Long id)
   {
	   bookService.delete(id);
	   return new ResponseEntity<String>("book was deleted",HttpStatus.OK);
   }
}
