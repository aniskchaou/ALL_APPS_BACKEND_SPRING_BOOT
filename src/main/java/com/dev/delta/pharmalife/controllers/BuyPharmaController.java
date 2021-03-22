package com.dev.delta.pharmalife.controllers;

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

import com.dev.delta.pharmalife.entities.BuyPharma;
import com.dev.delta.pharmalife.services.BuyPharmaService;


@RestController
@RequestMapping("/pharmalife/buy")
@CrossOrigin
public class BuyPharmaController {
	@Autowired
	BuyPharmaService buyService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody BuyPharma projectBuy, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        BuyPharma newPT = buyService.saveOrUpdate(projectBuy);

	        return new ResponseEntity<BuyPharma>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<BuyPharma> getAllBuys()
   {
	   return buyService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<BuyPharma> getBuyById(@PathVariable Long id)
   {
	   BuyPharma buy=buyService.findById(id);
	   return new ResponseEntity<BuyPharma>(buy,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteBuy(@PathVariable Long id)
   {
	   buyService.delete(id);
	   return new ResponseEntity<String>("buy was deleted",HttpStatus.OK);
   }
}
