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

import com.dev.delta.gym.entities.RevenueGYM;
import com.dev.delta.gym.service.RevenueGYMService;

@RestController
@RequestMapping("/fastbus/revenue")
@CrossOrigin
public class RevenueGYMController {
	@Autowired
	RevenueGYMService revenueService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody RevenueGYM projectRevenue, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        RevenueGYM newPT = revenueService.saveOrUpdate(projectRevenue);

	        return new ResponseEntity<RevenueGYM>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<RevenueGYM> getAllRevenues()
   {
	   return revenueService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<RevenueGYM> getRevenueById(@PathVariable Long id)
   {
	   RevenueGYM revenue=revenueService.findById(id);
	   return new ResponseEntity<RevenueGYM>(revenue,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteRevenue(@PathVariable Long id)
   {
	   revenueService.delete(id);
	   return new ResponseEntity<String>("revenue was deleted",HttpStatus.OK);
   }
}
