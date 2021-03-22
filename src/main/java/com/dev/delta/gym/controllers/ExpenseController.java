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

import com.dev.delta.gym.entities.Expense;
import com.dev.delta.gym.service.ExpenseService;

@RestController
@RequestMapping("/fastbus/expense")
@CrossOrigin
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Expense projectExpense, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Expense newPT = expenseService.saveOrUpdate(projectExpense);

	        return new ResponseEntity<Expense>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Expense> getAllExpenses()
   {
	   return expenseService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Expense> getExpenseById(@PathVariable Long id)
   {
	   Expense expense=expenseService.findById(id);
	   return new ResponseEntity<Expense>(expense,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteExpense(@PathVariable Long id)
   {
	   expenseService.delete(id);
	   return new ResponseEntity<String>("expense was deleted",HttpStatus.OK);
   }
}
