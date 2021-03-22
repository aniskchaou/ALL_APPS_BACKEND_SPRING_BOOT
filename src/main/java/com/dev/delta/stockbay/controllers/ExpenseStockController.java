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
import com.dev.delta.stockbay.entities.ExpenseStock;
import com.dev.delta.stockbay.services.ExpenseStockService;
@RestController
@RequestMapping("/stockbay/expense")
@CrossOrigin
public class ExpenseStockController {
	@Autowired
	ExpenseStockService expenseService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody ExpenseStock projectExpense, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        ExpenseStock newPT = expenseService.saveOrUpdate(projectExpense);

	        return new ResponseEntity<ExpenseStock>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<ExpenseStock> getAllExpenses()
   {
	   return expenseService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<ExpenseStock> getExpenseById(@PathVariable Long id)
   {
	   ExpenseStock expense=expenseService.findById(id);
	   return new ResponseEntity<ExpenseStock>(expense,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteExpense(@PathVariable Long id)
   {
	   expenseService.delete(id);
	   return new ResponseEntity<String>("expense was deleted",HttpStatus.OK);
   }
}
