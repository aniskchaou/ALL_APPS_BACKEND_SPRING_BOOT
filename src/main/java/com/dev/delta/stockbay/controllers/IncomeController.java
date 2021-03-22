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
import com.dev.delta.stockbay.entities.IncomeStock;
import com.dev.delta.stockbay.services.IncomeService;
@RestController
@RequestMapping("/stockbay/income")
@CrossOrigin
public class IncomeController {
	@Autowired
	IncomeService incomeService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody IncomeStock projectIncome, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        IncomeStock newPT = incomeService.saveOrUpdate(projectIncome);

	        return new ResponseEntity<IncomeStock>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<IncomeStock> getAllIncomes()
   {
	   return incomeService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<IncomeStock> getIncomeById(@PathVariable Long id)
   {
	   IncomeStock income=incomeService.findById(id);
	   return new ResponseEntity<IncomeStock>(income,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteIncome(@PathVariable Long id)
   {
	   incomeService.delete(id);
	   return new ResponseEntity<String>("income was deleted",HttpStatus.OK);
   }
}
