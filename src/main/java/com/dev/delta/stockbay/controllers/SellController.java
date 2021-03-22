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
import com.dev.delta.stockbay.entities.Sell;
import com.dev.delta.stockbay.services.SellService;
@RestController
@RequestMapping("/stockbay/sell")
@CrossOrigin
public class SellController {
	@Autowired
	SellService sellService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Sell projectSell, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Sell newPT = sellService.saveOrUpdate(projectSell);

	        return new ResponseEntity<Sell>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Sell> getAllSells()
   {
	   return sellService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Sell> getSellById(@PathVariable Long id)
   {
	   Sell sell=sellService.findById(id);
	   return new ResponseEntity<Sell>(sell,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteSell(@PathVariable Long id)
   {
	   sellService.delete(id);
	   return new ResponseEntity<String>("sell was deleted",HttpStatus.OK);
   }
}
