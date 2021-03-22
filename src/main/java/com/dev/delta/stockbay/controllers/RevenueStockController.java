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
import com.dev.delta.stockbay.entities.RevenueStock;
import com.dev.delta.stockbay.services.RevenueStockService;
@RestController
@RequestMapping("/stockbay/revenue")
@CrossOrigin
public class RevenueStockController {
	@Autowired
	RevenueStockService revenueService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody RevenueStock projectRevenue, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        RevenueStock newPT = revenueService.saveOrUpdate(projectRevenue);

	        return new ResponseEntity<RevenueStock>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<RevenueStock> getAllRevenues()
   {
	   return revenueService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<RevenueStock> getRevenueById(@PathVariable Long id)
   {
	   RevenueStock revenue=revenueService.findById(id);
	   return new ResponseEntity<RevenueStock>(revenue,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteRevenue(@PathVariable Long id)
   {
	   revenueService.delete(id);
	   return new ResponseEntity<String>("revenue was deleted",HttpStatus.OK);
   }
}
